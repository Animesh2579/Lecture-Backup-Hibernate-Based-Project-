package LectureBackup.app;


public class TeacherSignIn {
  private String teacherId;
  private String teacherPass;

    public TeacherSignIn() {
    }

    public TeacherSignIn(String teacherId, String teacherPass) {
        this.teacherId = teacherId;
        this.teacherPass = teacherPass;
    }

    public String getTeacherPass() {
        return teacherPass;
    }

    public void setTeacherPass(String teacherPass) {
        this.teacherPass = teacherPass;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
  
}
