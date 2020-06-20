package lab.spring.aop.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lab.spring.aop.persist.UserVO;
import lab.spring.aop.service.UserService;

public class DBTest {

	public static void main(String[] args) {
		
		String[] configs = new String[]{"springDao.xml"};
		ApplicationContext context =
				new ClassPathXmlApplicationContext(configs);
		UserService service =
				context.getBean("userService", UserService.class);
		System.out.println("###전체목록###");
		List<UserVO> lists = service.findUserList();
		Iterator<UserVO> iter = lists.iterator();
		while (iter.hasNext()) {
			UserVO u = iter.next();
			System.out.println(u);
		}	
	
	UserVO vo = new UserVO();
	vo.setUserid("s3");
	vo.setUsername("서울3");
	vo.setUserpwd("1234");
	vo.setEmail("seoul@korea.or.kr");
	vo.setPhone("02-129");
	vo.setAddress("서울");
	vo.setJob("IT개발");
	System.out.println("insert rows =>" + service.registMember(vo));
	System.out.println("###s3 아이디 한행 검색###");
	System.out.println(service.findUser("s3"));
	
	vo.setUserid("s3");
	vo.setEmail("s3@gmail.or.kr");
	vo.setPhone("02-129-1234");
	vo.setAddress("부산");
	vo.setJob("데이터 분석");
	System.out.println("update:s3 =>" + service.updateUser(vo));	
	System.out.println(service.findUser("s3"));
	System.out.println("delete:s3 =>" + service.removeUser("s3"));
	System.out.println("### 전체 목록 ###");
		lists = service.findUserList();
		iter = lists.iterator();
		while (iter.hasNext()) {
			UserVO u = iter.next();
			System.out.println(u);
		}
	}
	
	
	

}
