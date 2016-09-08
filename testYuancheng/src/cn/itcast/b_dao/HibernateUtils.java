package cn.itcast.b_dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	// SessionFactoryȫ��ֻ��Ҫһ���Ϳ�����
	private static SessionFactory sessionFactory;

	static {
		
		sessionFactory = new Configuration()//
	              	.configure()//
		            .buildSessionFactory();

	}

	/**
	 * ��ȡȫ��Ψһ��SessionFactory
	 * 
	 * @return
	 */
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * ��ȫ��Ψһ��SessionFactory�д�һ��Session
	 * 
	 * @return
	 */
	public static Session openSession() {
		return sessionFactory.openSession();
	}

}
