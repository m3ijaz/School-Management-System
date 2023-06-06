package schoolmangement;

public class Student_Info {
    
    public String studentName;
    public String studentId;
    public String studentMoblile;

    public Student_Info() {
    }

    public Student_Info(String studentName, String studentId, String studentMoblile) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentMoblile = studentMoblile;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentMoblile() {
        return studentMoblile;
    }

    public void setStudentMoblile(String studentMoblile) {
        this.studentMoblile = studentMoblile;
    }

    @Override
    public String toString() {
        return "Student_Info{" + "studentName=" + studentName + ", studentId=" + studentId + ", studentMoblile=" + studentMoblile + '}';
    }
    
}
