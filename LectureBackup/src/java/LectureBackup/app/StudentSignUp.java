
package LectureBackup.app;


public class StudentSignUp {
    private String enrId;
    private String name;
    private String contactNo;
    private String emailId;
    private String gender;
    private String password;

    public StudentSignUp() {
    }

    public StudentSignUp(String enrId, String name, String contactNo, String emailId, String gender, String password) {
        this.enrId = enrId;
        this.name = name;
        this.contactNo = contactNo;
        this.emailId = emailId;
        this.gender = gender;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEnrId() {
        return enrId;
    }

    public void setEnrId(String enrId) {
        this.enrId = enrId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
}
