package LectureBackup.app;

public class complaintOp {
private String opId;
private String password;

    public complaintOp() {
    }

    public complaintOp(String opId, String password) {
        this.opId = opId;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOpId() {
        return opId;
    }

    public void setOpId(String opId) {
        this.opId = opId;
    }

}
