package cn.dong.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.dong.hibernate.orm.User;
import cn.dong.hibernate.util.HibernateSessionFactory;

public class Test {

	public static void main(String[] args) {  
		
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();  

		User user=new User();  
		user.setName("1yjli");  
		user.setAge(new Integer(2));  
		
		session.save(user);  
		tx.commit();  
		HibernateSessionFactory.closeSession();
		System.out.println("OK!");  
		}  
	
}
