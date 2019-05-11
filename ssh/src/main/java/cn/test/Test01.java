package cn.test;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import cn.entity.Good;

public class Test01 {
public static void main(String[] args) {
	//读取配置文件 默认的配置文件的名称是hibernate.cfg.xml
	Configuration tion=new Configuration().configure();
	//生成会话工厂
	SessionFactory ctory=tion.buildSessionFactory();
	//得到会话工厂
	Session session=ctory.openSession();
	
	//查询一条信息
//Good g=(Good) session.get(Good.class, 5);
//System.out.println(g.toString());
	
	
	
	
	//对于数据的增 删 改操作需要提交事务=>通过session得到事务
//Transaction tx=session.beginTransaction();
	
	//增加数据
//	Good g=new Good();
//	g.setNamee("我变强了，也变秃了");
//	g.setAuthore("沙雕胡文");
//	g.setTypee(2);
//	session.save(g);//增加数据的方法
//  tx.commit();//提交事务

	//删除数据
//	Good g=new Good();
//	g.setMid(15);
//	session.delete(g);
//  tx.commit();//提交事务
	
	//修改数据     此处修改有bug,数据库设置了非空的话，这里就要给非空的项赋值,不管你是否要更改
//	Good g=new Good();
//	g.setMid(10);
//	g.setNamee("诛神黄昏");
//	g.setAuthore("沙雕堡");
//	g.setTypee(2);
//	session.update(g);
//	tx.commit();//提交事务
	
}
}
