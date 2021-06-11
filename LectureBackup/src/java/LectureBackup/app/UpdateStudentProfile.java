
package LectureBackup.app;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateStudentProfile {
    public static void main(String[] args) {
        Configuration conf=new Configuration();
        Configuration c1=conf.configure();
        SessionFactory sf=c1.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter enrno to update your record");
        String roll=sc.next();
        StudentSignUp st=(StudentSignUp)session.get(StudentSignUp.class,roll);
        if(st==null)
        {
            System.out.println("Record not found");
        }
        else
        {
            System.out.println("Your Present entries are:");
            System.out.println(st.getName()+" "+st.getContactNo()+" "+st.getPassword());
            System.out.println("Select Your Choice");
            System.out.println("1.Update Name");
            System.out.println("2.Update Contact No.");
            System.out.println("3.update Password");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter Updated Student Name");
                    String uName=sc.next();
                    st.setName(uName);
                    session.update(st);
                    break;
                case 2:
                    System.out.println("Enter New Contact No.");
                    String cntNew=sc.next();
                    st.setContactNo(cntNew);
                    session.update(st);
                    break;
                case 3:
                    System.out.println("Enter your Old password");
                    String old=sc.next();
                    if(old.equals(st.getPassword()))
                    {
                        System.out.println("Enter your new password");
                        String newPass=sc.next();
                        System.out.println("Re enter your new password");
                        String reNewPass=sc.next();
                        if(newPass.equals(reNewPass))
                        {
                            st.setPassword(newPass);
                            session.update(st);
                        }
                        else
                        {
                            System.out.println("Doesnt match");
                        }
                    }
                    else
                    {
                        System.out.println("Your old password is incorrect");
                    }
                    break;
            }
            tx.commit();
            System.out.println("New Entries are:");
            System.out.println(st.getName()+" "+st.getContactNo()+" "+st.getPassword());
        }
    }
  
}
