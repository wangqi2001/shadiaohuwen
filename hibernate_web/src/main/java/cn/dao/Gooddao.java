package cn.dao;

import java.util.List;

import cn.entity.Good;

public interface Gooddao {
	/**
	 * 查询所有
	 * @return
	 */
public List<Good> fli();
/**
 * 添加数据
 * @param good
 * @return
 */
public void add(Good good);
/**
 * 删除数据
 * @param good
 */
public void delete(Good good);
/**
 * 根据id查询特定的数据
 * @param dao
 * @return
 */
public List<Good> flii(int a);
/**
 * 修改数据
 * @param good
 */
public void update(Good good);
}
