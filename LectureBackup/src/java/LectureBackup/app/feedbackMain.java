
package LectureBackup.app;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;
public class feedbackMain  {
    public static void main(String[] args){
        Configuration conf=new Configuration();
        Configuration c1=conf.configure();
        SessionFactory sf=c1.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Enr Id");
        String enrId=sc.next();
        System.out.println("Enter name");
        String name=sc.next();
        System.out.println("Enter contact no");
        String contactNo=sc.next();
        System.out.println("Enter EmailId");
        String emailId=sc.next();
        System.out.println("Enter feedback");
        String feedback=sc.next();
        feedback fb=new feedback(enrId,name,contactNo,emailId,feedback);
        session.save(fb);
        tx.commit();
        session.close();
        System.out.println("Record Inserted!!!");
    }
         
}
