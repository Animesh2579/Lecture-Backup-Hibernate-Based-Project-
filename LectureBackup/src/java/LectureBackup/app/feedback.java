package LectureBackup.app;

public class feedback {
private int fbId;
private String id;
private String name;
private String contactNo;
private String emailId;
private String feedback;

    public feedback() {
    }

    public feedback(String id, String name, String contactNo, String emailId, String feedback) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.emailId = emailId;
        this.feedback = feedback;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
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

    public int getFbId() {
        return fbId;
    }

    public void setFbId(int fbId) {
        this.fbId = fbId;
    }

}
