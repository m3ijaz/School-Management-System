package schoolmangement;

public class Grade_Calculation extends Grade_Info{
    
    public  String Grade;

    public Grade_Calculation(){
        
        super.mark_info();
        
        double midMark = super.getMidMark() * 0.4;
        double finalMark = super.getFinalMark() * 0.6;
        
        double totalMark = midMark + finalMark;
        
        if(totalMark < 50){
            Grade = "F";
        }
        else if(totalMark >= 50 && totalMark < 60){
            Grade = "D";
        }
        else if(totalMark >= 60 && totalMark < 70){
            Grade = "C";
        }
        else if(totalMark >= 70 && totalMark < 80){
            Grade = "B";
        }
        else if(totalMark >= 80 && totalMark < 90){
            Grade = "A";
        }
        else if(totalMark >= 90 && totalMark <= 100){
            Grade = "A+";
        }
        else{
            Grade = "Information Missing";
        }
    }
}
