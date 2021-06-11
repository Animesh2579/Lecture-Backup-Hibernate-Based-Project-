package LectureBackup.app;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;
public class TeacherSignInMain {
        public static void main(String[] args){
        Configuration conf=new Configuration();
        Configuration c1=conf.configure();
        SessionFactory sf=c1.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Teacher Id");
        String teacherId=sc.next();
        System.out.println("Enter password");
        String pass=sc.next();
        TeacherSignIn tsi=new TeacherSignIn(teacherId,pass);
        session.save(tsi);
        tx.commit();
        session.close();
        System.out.println("Record Inserted!!!");
    }
}
