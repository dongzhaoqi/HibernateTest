package cn.dong.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.dong.hibernate.orm.AddressInf;
import cn.dong.hibernate.orm.PersonInf;
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
	
	@org.junit.Test
	public void testPerson(){
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();  
		
		PersonInf p = new PersonInf();
		
		AddressInf a = new AddressInf("上海");
		p.setName("Jack");
		p.setAge(25);
		p.setAddress(a);
		session.persist(p);
		AddressInf b = new AddressInf("广州");
		p.setAddress(b);
		tx.commit();
		HibernateSessionFactory.closeSession();
		System.out.println("OK!!!!");
	}
	
}
