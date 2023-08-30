package com.tut;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "running...." );
//        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        
        // creating student
        Student st = new Student("Mariya","7058060004","Nagpur");
        
        // creating Address
        Address ad = new Address();
        ad.setStreet("street1");
        ad.setCity("Pachora");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(121.1212);
        
        
        // Adding Image 
        FileInputStream fis = new FileInputStream("src/main/java/forDelete.png");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        
        
        
        Session session = factory.openSession();
        
        Transaction tx = session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
        
        System.out.println("Done...");
     }
}
