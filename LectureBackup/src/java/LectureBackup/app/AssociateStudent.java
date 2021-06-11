/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureBackup.app;

/**
 *
 * @author LENOVO
 */
public class AssociateStudent {
    private int rollNo;
    private String stuName;
    private AssociateAddress ad;

    public AssociateStudent() {
    }

    public AssociateStudent(int rollNo, String stuName, AssociateAddress ad) {
        this.rollNo = rollNo;
        this.stuName = stuName;
        this.ad = ad;
    }

    public AssociateAddress getAd() {
        return ad;
    }

    public void setAd(AssociateAddress ad) {
        this.ad = ad;
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
    
}
