package LectureBackup.app;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;
public class RequestMain {
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
        System.out.println("Enter Course");
        String course=sc.next();
        System.out.println("Enter Branch");
        String branch=sc.next();
        System.out.println("Enter semester");
        String semester=sc.next();
        System.out.println("Enter section");
        String section=sc.next();
        System.out.println("Enter date on which you missed lecture");
        String date=sc.next();
        System.out.println("Enter subject");
        String subject=sc.next();
        System.out.println("Enter Faculty Name");
        String facultyName=sc.next();
        System.out.println("Enter contact no");
        String contactNo=sc.next();
        System.out.println("Enter EmailId");
        String emailId=sc.next();
        Request rq=new Request(enrId,name,course,branch,semester,section,date,subject,facultyName,contactNo,emailId);
        session.save(rq);
        tx.commit();
        session.close();
        System.out.println("Record Inserted!!!");
    }   
}
