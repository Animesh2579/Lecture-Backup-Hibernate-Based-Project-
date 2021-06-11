
package LectureBackup.app;

import java.util.Scanner;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

    public static void main(String[] args) {
        Configuration conf=new Configuration();
        Configuration c1=conf.configure();
        SessionFactory sf=c1.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter enroll no. to delete record");
         String roll=sc.next();
         try{
            StudentSignUp st=(StudentSignUp)session.load(StudentSignUp.class,roll);
            session.delete(st);
            tx.commit();
            System.out.println("Record Deleted");
         }
         catch(HibernateException e)
         {
             System.out.println("Record Not found");
         }
         session.close();
    }
}
