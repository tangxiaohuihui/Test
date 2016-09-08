package cn.itcast.b_dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import cn.itcast.a_helloworld.User;

public class UserDao {

	
	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public List<User> findAll() {
		Session session = HibernateUtils.openSession();
		Transaction tx=null;
		try {
			 tx = session.beginTransaction();
			 
		List<User> list=session.createQuery("FROM xjk_privilege").list();
			
			 
			tx.commit();
			return list;
		} catch (RuntimeException e) {
          tx.rollback(); //回滚
          throw e;
		} finally {
			session.close();
		}

	}

}
