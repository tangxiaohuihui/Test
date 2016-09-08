package cn.itcast.b_dao;


import java.util.List;

import org.junit.Test;

import cn.itcast.a_helloworld.User;

public class UserDaoTest {
	private UserDao userDao=new UserDao();


	@Test
	public void testFindAll() {
		List<User> list=userDao.findAll();
		for(User user:list){
			System.out.println(user);
		}
	}

}
