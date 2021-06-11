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
public class AssociateAddress {
    private int streetNo;
    private String address;
    private String city;

    public AssociateAddress() {
    }

    public AssociateAddress(int streetNo, String address, String city) {
        this.streetNo = streetNo;
        this.address = address;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
