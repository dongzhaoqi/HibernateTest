package cn.dong.hibernate.test;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration; 

public class Test {

	public static void main(String[] args) {  
		// TODO Auto-generated method stub  
		Configuration config=new Configuration().configure();  
		SessionFactory sessionFactory=config.buildSessionFactory();  
		 
		User user=new User();  
		user.setName("1yjli");  
		user.setAge(new Integer(2));  
		
		Session session=sessionFactory.openSession();  
		Transaction tx=session.beginTransaction();  
		session.save(user);  
		tx.commit();  
		session.close();  
		sessionFactory.close();  
		System.out.println("OK!");  
		 
		}  
}
