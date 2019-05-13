package cn.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import cn.dao.Gooddao;
import cn.entity.Good;

@Component
public class Gooddaoimp implements Gooddao{
	@Autowired
private HibernateTemplate hli;
	
	@Override
	public List<Good> fli() {
		return hli.find("from Good");
	}
	@Override
	public void add(Good good) {
		// TODO Auto-generated method stub
		hli.save(good);
	}
	@Override
	public void delete(Good good) {
		// TODO Auto-generated method stub
		hli.delete(good);
	}
	@Override
	public void update(Good good) {
		hli.update(good);
	}
}
