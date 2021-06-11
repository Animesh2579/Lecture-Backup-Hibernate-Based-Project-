
package LectureBackup.app;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ShowAll {
    public static void main(String[] args) {
        SessionFactory sf=ConnectionFactory.emergencyConnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        Criteria crit=session.createCriteria(StudentSignUp.class);
        //crit.add(Restrictions.eq("name","anu"));
        crit.add(Restrictions.eq("enrId","78"));
        ProjectionList pl=Projections.projectionList();
        pl.add(Projections.property("enrId"));
        pl.add(Projections.property("name"));
        crit.setProjection(pl);
        //crit.addOrder(Order.asc("name"));
        //crit.setFirstResult(1);
        //crit.setMaxResults(1);
        List<Object[]> myList=crit.list();
        if(myList.isEmpty())
        {
            System.out.println("No record found");
        }
        else
        {
            for(Object st[]:myList)
            {
                System.out.println(st[0]+" "+st[1]);
            }
        }
    }
    
}
