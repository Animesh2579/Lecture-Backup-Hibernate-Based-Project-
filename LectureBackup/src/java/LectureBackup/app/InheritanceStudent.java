/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureBackup.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author LENOVO
 */
public class InheritanceStudent extends InheritanceCollege {
    int rollNo;
    String stuName;

    public InheritanceStudent() {
    }

    public InheritanceStudent(int rollNo, String stuName, int regNo, String collName, String services) {
        super(regNo, collName, services);
        this.rollNo = rollNo;
        this.stuName = stuName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    

    public static void main(String[] args) {
        SessionFactory sf=ConnectionFactory.emergencyConnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        InheritanceStudent st=new InheritanceStudent(12,"radhe",55211,"SVITS","jdksfjkc");
        session.save(st);
        tx.commit();
        session.close();
        System.out.println("Record inserted!!!");
    }
}
