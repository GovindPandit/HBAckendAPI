package com.niit.daoimpl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.niit.dao.UserDAO;
import com.niit.model.User;
import com.niit.util.HibernateUtil;

public class UserDAOImpl implements UserDAO
{
	
	public boolean addUser(User user) 
	{
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.save(user);
		return true;
	}

	public boolean deleteUser(int userid) 
	{
		User user=new User();
		user.setUserid(userid);
		
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.delete(user);
		return true;
	}

	public boolean updateUser(User user) 
	{
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.update(user);
		return true;
	}

	public List<User> displayUsers() 
	{
		Session session=HibernateUtil.getSession();
		return session.createQuery("from com.niit.model.User").getResultList();
	}

}
