package schoolmangement;

import java.util.Scanner;

public class Grade_Info {
    
    private double midMark;
    private double finalMark;
    
    public void mark_info(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Mid_Mark : ");
        this.midMark = input.nextDouble();
        System.out.println("Enter Final_Mark : ");
        this.finalMark = input.nextDouble();
    }

    public Grade_Info() {
    }

    public Grade_Info(double midMark, double finalMark) {
        this.midMark = midMark; 
        this.finalMark = finalMark;
    }

    public double getMidMark() {
        return midMark;
    }

    public void setMidMark(double midMark) {
        this.midMark = midMark;
    }

    public double getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(double finalMark) {
        this.finalMark = finalMark;
    }

    @Override
    public String toString() {
        return "Grade_Info{" + "midMark=" + midMark + ", finalMark=" + finalMark + '}';
    }
}
