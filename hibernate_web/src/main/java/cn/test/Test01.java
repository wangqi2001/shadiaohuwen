package cn.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.dao.Gooddao;
import cn.entity.Good;

public class Test01 {
public static void main(String[] args) {
	ApplicationContext li=new ClassPathXmlApplicationContext("beans.xml");
	String[]a=li.getBeanDefinitionNames();
	for (String string : a) {
		System.out.println(string);
	}
	Gooddao dao=(Gooddao) li.getBean("gooddaoimp");
//	Good good=new Good();
//	good.setNamee("我变强了，也变秃了");
//	good.setAuthore("佛系");
//	good.setTypee(2);
//	dao.add(good);
	
	List<Good> list=dao.fli();
	System.out.println(list);
	
//	Good good=new Good();
//	good.setMid(10);
//	dao.delete(good);
	
//	Good good=new Good();
//	good.setMid(11);
//	good.setNamee("没我跳");
//	good.setAuthore("哈撒给");
//	good.setTypee(2);
//	dao.update(good);
}
}
