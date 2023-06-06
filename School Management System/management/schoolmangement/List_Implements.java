package schoolmangement;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class List_Implements implements List {

    @Override
    public void CourseFaculty() {
        Student student = new Student();
        String details;
        details = student.courseList.toString();
        try{
            File file = new File("CourseFaculty.txt");
            FileOutputStream fos = new FileOutputStream(file,true);
            PrintWriter writer = new PrintWriter(fos);
            writer.append(details + "\n");
            writer.close();
            fos.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void StudentCourseListGrade() {
        int i=0;
        Student student = new Student();
        Grade_Calculation grade = new Grade_Calculation();
        String details;
        //String[] cfsg = new String[100];
        //ArrayList<String> cfsg2 = new ArrayList<String>();
        details = student.info.studentName +"-"+ student.info.studentId +"-"+ student.info.studentMoblile +"\n--------\n"+
                  student.courseList.toString();
        try{
            File file = new File("CourseFacultyStudentsGrade.txt");
            FileOutputStream fos = new FileOutputStream(file,true);
            PrintWriter writer = new PrintWriter(fos);
            writer.append(details + "\n");
            writer.close();
            fos.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}