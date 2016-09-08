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
	 * ��ѯ����
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
          tx.rollback(); //�ع�
          throw e;
		} finally {
			session.close();
		}

	}

}
