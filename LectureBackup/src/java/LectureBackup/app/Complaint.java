package LectureBackup.app;

public class Complaint {
private int srNo;
private String id;
private String name;
private String complaint;
private String contactNo;
private String status;

    public Complaint() {
    }

    public Complaint(String id, String name, String complaint, String contactNo, String status) {
        
        this.id = id;
        this.name = name;
        this.complaint = complaint;
        this.contactNo = contactNo;
        this.status = status;
    }

    public int getSrNo() {
        return srNo;
    }

    public void setSrNo(int srNo) {
        this.srNo = srNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
   
}