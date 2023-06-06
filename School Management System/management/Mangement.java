import schoolmangement.*;
import java.io.File;
import java.util.Scanner;

 class Mangement {

    public static void main(String[] args) {
        
        System.out.println("WELCOME TO STUDENT MANAGEMENT SYSTEM");
        System.out.println("-------------------------------------");

        Scanner input = new Scanner(System.in);

        File file1 = new File("F:/CourseFaculty.txt");
        File file2 = new File("F:/CourseFacultyStudentsGrade.txt");
        try {
            if (file1.exists() &&  file2.exists()) {

            } else {
                file1.createNewFile();
                file2.createNewFile();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("USERNAME = admin");
        System.out.println("PASSWARD = admin");

        int y = 10;
        while (y != 0) {
            System.out.println("LOGIN");
            System.out.println("------");
            System.out.println("Enter Username : ");
            String a = input.nextLine();
            System.out.println("Enter Passward : ");
            String b = input.nextLine();

            Admin admin = new Admin();
            int x = admin.login(a, b);

            if (x == 1) {
                System.out.println("LOGIN SUCCESSFUL");
                y = 0;
            } 
            else {
                System.out.println("WRONG INFORMATION");
            }
        }

        int i = 5;

        while (i != 0) {

            System.out.println("Press 1 to add Student Information.");
            System.out.println("Press 2 to show Student and Teacher.");
            System.out.println("Press 3 to show StudentCourseList with Grade");
            System.out.println("To Exit press 0");
            
            i = input.nextInt();
            
            if(i == 1){
                System.out.println("STUDENT INFORMATION");
                Student student = new Student();
                student.setStu_Info();
                System.out.println("Every Student should have 3 course.\n");
                student.arrayDeclare();
            }
            else if(i == 2){
                try{
                    System.out.println("---Course & Faculty---\n");
                    File file = new File("F:/CourseFaculty.txt");
                    Scanner scan = new Scanner(file);
                    while(scan.hasNextLine()){
                        System.out.println(scan.nextLine());
                    }
                }catch(Exception e){
                    System.out.println(e);
                }
            }
            else if(i == 3){
                try{
                    System.out.println("---Course Facuty Student and Grade---\n");
                    File file = new File("F:/CourseFacultyStudentsGrade.txt");
                    Scanner scan = new Scanner(file);
                    while(scan.hasNextLine()){
                        System.out.println(scan.nextLine());
                    }
                }catch(Exception e){
                    System.out.println(e);
                }
            }
            else{
                System.out.println("THANK YOU");
            }
        }
    }
}
