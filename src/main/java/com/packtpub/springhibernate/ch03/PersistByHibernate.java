package com.packtpub.springhibernate.ch03;


import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
 
public class PersistByHibernate {

	public static void main(String[] args) {
		
		//configuring Hibernate
		Configuration config = new Configuration();
		
		config.setProperty("hibernate.dialect",	"org.hibernate.dialect.HSQLDialect");
		config.setProperty("hibernate.connection.driver_class",	"org.hsqldb.jdbcDriver");
		config.setProperty("hibernate.connection.url",	"jdbc:hsqldb:hsql://localhost/hiberdb");
		config.setProperty("hibernate.connection.username", "sa");
		config.setProperty("hibernate.connection.password", "");
		
		//introducing persistent classess to Hibernate
		
		config.addClass(Student.class);
		
		//obtaining a session object
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		
		// Starting a transaction
		Transaction tx = session.beginTransaction();
		
		//persisting
		Student student = new Student("Hamid","Doosti");
		session.save(student);
		
		//commiting the transaction
		tx.commit();
		session.close();
		
		
		

	}

}
