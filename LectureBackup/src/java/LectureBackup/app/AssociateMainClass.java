
package LectureBackup.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AssociateMainClass {
    public static void main(String[] args) {
        SessionFactory sf=ConnectionFactory.emergencyConnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        AssociateAddress add=new AssociateAddress(122,"Tilak Nagar","Indore");
        session.save(add);
        AssociateStudent st=new AssociateStudent(1,"Animesh",add);
        session.save(st);
        tx.commit();
        session.close();
    }
    
}
