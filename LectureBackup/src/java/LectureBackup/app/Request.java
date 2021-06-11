 package LectureBackup.app;

 public class Request 
 {
 private int srNo;
 private String enrId;
 private String name;
 private String course;
 private String branch;
 private String semester;
 private String section;
 private String date;
 private String subject;
 private String facultyName;
 private String contact;
 private String email;

    public Request() {
    }

    public Request(String enrId, String name, String course, String branch, String semester, String section, String date, String subject, String facultyName, String contact, String email) {
        
        this.enrId = enrId;
        this.name = name;
        this.course = course;
        this.branch = branch;
        this.semester = semester;
        this.section = section;
        this.date = date;
        this.subject = subject;
        this.facultyName = facultyName;
        this.contact = contact;
        this.email = email;
    }

    public int getSrNo() {
        return srNo;
    }

    public void setSrNo(int srNo) {
        this.srNo = srNo;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
