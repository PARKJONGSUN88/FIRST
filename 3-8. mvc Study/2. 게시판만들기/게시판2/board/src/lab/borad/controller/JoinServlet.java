package lab.borad.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lab.board.model.UserMgrDAO;
import lab.board.model.UserVO;

@WebServlet("/join.do")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public JoinServlet() {
        super();       
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.sendRedirect("./member.jsp");
    }	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");		
		
		UserVO vo = new UserVO();
		String userid = request.getParameter("userid");		
		String username = request.getParameter("username");
		String userpwd = request.getParameter("userpwd");
		String phone = request.getParameter("phone");			
		String email = request.getParameter("email")+"@";
		if(request.getParameter("email_dns")=="") {
			email += request.getParameter("email_dns");
		}else {
			email += request.getParameter("emailaddr");
		}
		
		String job;
		switch(request.getParameter("job")) {
		case "39" : job = "�л�"; break;
		case "40" : job = "��ǻ��/���ͳ�"; break;
		case "41" : job = "���"; break;
		case "42" : job = "������"; break;
		case "43" : job = "����"; break;
		case "44" : job = "���񽺾�"; break;
		case "45" : job = "����"; break;
		case "46" : job = "����"; break;
		case "47" : job = "�����"; break;
		case "48" : job = "����"; break;
		case "49" : job = "�Ƿ�"; break;
		default : job = "����"; break;
		}	
		
		String address = request.getParameter("address");
		UserMgrDAO dao = new UserMgrDAO();
		ServletContext sc =request.getServletContext();
		RequestDispatcher rd = null;
		if(dao.joinProc(vo)>0) {
			response.sendRedirect("./login.do");
		} else {
			out.print("<script>");
			out.print("alert(\"ȸ������ ����\");");
			out.print("location.href=\"./member.jsp\"");
			out.print("</script>");
		}
	}
		
}
