package com.helper;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import myproject.note;

public class Factoryprovider {
	
	public static  SessionFactory factory;
	
	public static Session getSession()
	{
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		
		Session  session=factory.openSession();
		
		return session; 
		
		
		
	}

	public static void insert(note note) {
	
		Session session=Factoryprovider.getSession();
		session.beginTransaction();
		session.save(note);
		session.getTransaction().commit();
		session.close();
	}
	
	public static List<note> getAllNotes()
	{
		Session session=Factoryprovider.getSession();
		List<note> list=session.createQuery("from note").list();
		
		return list;
		
	}

	public static void delete(int id) {
		Session session=Factoryprovider.getSession();
		session.beginTransaction();
		note note=session.get(note.class,id);
		session.delete(note);
		session.getTransaction().commit();
		session.close();

		
	}

	public static note getSingleRecord(int id) {
	Session session=Factoryprovider.getSession();
	note n=(note)session.get(note.class, id);
		return n;
	}

	public static void updateDetail(note note) {
		Session session=Factoryprovider.getSession();
		session.beginTransaction();
		session.update(note);
		session.getTransaction().commit();
		session.close();
		
	}
	
	

}
