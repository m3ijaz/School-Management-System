package schoolmangement;

public class Course implements Teacher{
    
    public String courseName;
    public String courseCode;
    public String teacherName;
    public String teacherInitial;
    
    @Override
    public String teacherInfo(String teacherName, String teacherInitial) {
        this.teacherName = teacherName;
        this.teacherInitial = teacherInitial;
        return "Teacher Name : " +this.teacherName+ "Teacher Initial : " + this.teacherInitial;
    }

    public Course() {
    }

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public Course(String courseName, String courseCode, String teacherName, String teacherInitial) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.teacherName = teacherName;
        this.teacherInitial = teacherInitial;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherInitial() {
        return teacherInitial;
    }

    public void setTeacherInitial(String teacherInitial) {
        this.teacherInitial = teacherInitial;
    }

    @Override
    public String toString() {
        return "Course{" + "courseName=" + courseName + ", courseCode=" + courseCode + ", teacherName=" + teacherName + ", teacherInitial=" + teacherInitial + '}';
    }

}
