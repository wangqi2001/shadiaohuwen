package cn.dao.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import cn.dao.Gooddao;
import cn.entity.Good;

@Component
public class Gooddaoimp implements Gooddao{
	@Autowired
private HibernateTemplate hibernateTemplate;
	
	@Override
	public List<Good> fli() {
		return hibernateTemplate.find("from Good");
	}
	@Override
	public void add(Good good) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(good);
	}
	@Override
	public void delete(Good good) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(good);
	}
	@Override
	public void update(Good good) {
		hibernateTemplate.update(good);
	}
	@Override
	public List<Good> flii(int a) {
		return hibernateTemplate.find("from Good where mid="+a);
	}
}
