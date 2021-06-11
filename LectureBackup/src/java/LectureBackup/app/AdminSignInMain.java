package LectureBackup.app;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

public class AdminSignInMain {
    public static void main(String...args){
        Configuration conf=new Configuration();
        Configuration c1=conf.configure();    //used to load cfg file
        SessionFactory sf=c1.buildSessionFactory();     //used to execute session-factory tag
        Session session=sf.openSession();             //used to open table in session
        Transaction tx=session.beginTransaction();     //used to perform database operations
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter admin Id");
        String adminId=sc.next();
        System.out.println("Enter password");
        String password=sc.next();
        AdminSignIn asi=new AdminSignIn(adminId,password);
        session.save(asi);             //replacement of insert query
        tx.commit();
        session.close();
        System.out.println("Record Inserted!!!");
    }
}