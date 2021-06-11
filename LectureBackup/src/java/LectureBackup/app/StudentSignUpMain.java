
package LectureBackup.app;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;
import org.hibernate.ObjectNotFoundException;
public class StudentSignUpMain  {
    public static void main(String[] args){
        Configuration conf=new Configuration();
        Configuration c1=conf.configure();
        SessionFactory sf=c1.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Enr Id");
        String enrId=sc.next();
        StudentSignUp st=(StudentSignUp)session.get(StudentSignUp.class,enrId);
        if(st==null)
        {
        System.out.println("Enter name");
        String name=sc.next();
        System.out.println("Enter contact no");
        String contactNo=sc.next();
        System.out.println("Enter EmailId");
        String emailId=sc.next();
        System.out.println("Enter gender");
        String gender=sc.next();
        System.out.println("Enter password");
        String pass=sc.next();
        StudentSignUp ssu=new StudentSignUp(enrId,name,contactNo,emailId,gender,pass);
        session.save(ssu);
        tx.commit();
        
        System.out.println("Record Inserted!!!");
        }
        else
        {
            System.out.println("Record already exists");
        }

         session.close();
    }
         
}
