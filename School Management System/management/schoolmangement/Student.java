package schoolmangement;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Student {

    Scanner input = new Scanner(System.in);

    public Course course;
    public Student_Info info;
    public Course[] courseList = new Course[3];

    public void setStu_Info() {
        Student_Info obj = new Student_Info();
        System.out.println("Enter Student Name : ");
        obj.studentName = input.nextLine();
        System.out.println("Enter Student ID : ");
        obj.studentId = input.nextLine();
        System.out.println("Enter Student Mobile Number : ");
        obj.studentMoblile = input.nextLine();
        info = obj;
    }

    public void arrayDeclare() {
        for (int i = 0; i < 3; i++) {
            courseList[i] = new Course();
            System.out.println("Enter " + i  + "st" + " Course Name : ");
            String Cname = input.nextLine();
            System.out.println("Enter " + i  + "st" + "Course Code : ");
            String Ccode = input.nextLine();
            System.out.println("Enter Teacher Name for this course : ");
            String teacherName = input.nextLine();
            System.out.println("Enter Teacher Intial : ");
            String teacherInitial = input.nextLine();
            Grade_Calculation grade = new Grade_Calculation();
            course = new Course(Cname, Ccode, teacherName, teacherInitial + " | GRADE : " + grade.Grade);
            courseList[i].courseName = Cname;
            courseList[i].courseCode = Ccode;
            courseList[i].teacherName = teacherName;
            courseList[i].teacherInitial = teacherInitial;
            
            try {
                File file = new File("F:/CourseFaculty.txt");
                FileOutputStream fos = new FileOutputStream(file,true);
                PrintWriter writer = new PrintWriter(fos);
                writer.append(courseList[i]+"\n");
                writer.close();
                fos.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            
            courseList[i].courseName = Cname;
            courseList[i].courseCode = Ccode;
            courseList[i].teacherName = teacherName;
            courseList[i].teacherInitial = teacherInitial + " | GRADE : " + grade.Grade;

        }
        try {
                File file = new File("F:/CourseFaculty.txt");
                FileOutputStream fos = new FileOutputStream(file,true);
                PrintWriter writer = new PrintWriter(fos);
                writer.append("\n");
                writer.close();
                fos.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        
        String details = info +" \n"+ courseList[0] +"\n"+ courseList[1] +"\n"+ courseList[2] +"\n--------\n";
        
        try {
            File file = new File("F:/CourseFacultyStudentsGrade.txt");
            FileOutputStream fos = new FileOutputStream(file, true);
            PrintWriter writer = new PrintWriter(fos);
            writer.append(details + "\n");
            writer.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Student() {
    }

    public Student(Student_Info info) {
        this.info = info;
    }

    public Student_Info getInfo() {
        return info;
    }

    public void setInfo(Student_Info info) {
        this.info = info;
    }

    public Course[] getCourseList() {
        return courseList;
    }

    public void setCourseList(Course[] courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" + "info=" + info + ", courseList=" + courseList + '}';
    }

}
