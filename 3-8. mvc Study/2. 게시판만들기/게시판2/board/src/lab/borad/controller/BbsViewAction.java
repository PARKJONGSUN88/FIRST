package lab.borad.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lab.board.model.BbsDAO;
import lab.board.model.BbsVO;

@WebServlet("/view.do")
public class BbsViewAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public BbsViewAction() {
        super();     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		if(session.getAttribute("user")==null) {
			out.print("<script>");
			out.print("alert(\"�α��� �� �۳����� �� �� �ֽ��ϴ�.\");");
			out.print("location.href=\"./list.do\"");
			out.print("</script>");			
		}else {
			doPost(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");		
		PrintWriter out = response.getWriter();
		ServletContext sc = getServletContext();
		RequestDispatcher rd = null;
		BbsDAO dao = new BbsDAO();
		int num = Integer.parseInt(request.getParameter("bid"));
		String page = request.getParameter("page");
		BbsVO article = null;
		article = dao.getArticle(num);
		
		if(article != null) {
			request.setAttribute("article", article);
			request.setAttribute("bid", new Integer(num));
			request.setAttribute("page", new Integer(page));
			rd = sc.getRequestDispatcher("/bbs_view.jsp");
			rd.forward(request, response);
		}else {
			out.print("<script>");
			out.print("alert(\"�� ���� ��ȸ ����\");");
			out.print("location.href=\"./list.do\"");
			out.print("</script>");
		}		
	}

}
