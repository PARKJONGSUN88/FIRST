package lab.spring.web.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello.do", method=RequestMethod.GET)//get���� post���� ��û ��� ���� ���� ���⼭�� get���
	public ModelAndView sayHello() {
		ModelAndView mav= new ModelAndView();
		mav.addObject("greet", getGreeting());//request.setAttribute("key,
		mav.setViewName("hello");
		return mav;
	}

public String getGreeting() {
	long now=System.currentTimeMillis();
	int Hour=Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
	String message="";
	if(Hour < 12) {
		message="Good Morning ������ ��~";
		
	}else if(Hour <18) {
		message="Good Afternoon ������ ��~";
	}else {
		message="Good Evening ������ ��~";
	}
	return message;
}
}
