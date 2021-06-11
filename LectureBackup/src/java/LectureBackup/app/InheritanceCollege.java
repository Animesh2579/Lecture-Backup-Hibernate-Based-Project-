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
public class InheritanceCollege {
 private int regNo;
 private String collName;
 private String services;

    public InheritanceCollege() {
    }

    public InheritanceCollege(int regNo, String collName, String services) {
        this.regNo = regNo;
        this.collName = collName;
        this.services = services;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getCollName() {
        return collName;
    }

    public void setCollName(String collName) {
        this.collName = collName;
    }
 
}
