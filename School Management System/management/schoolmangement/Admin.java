package schoolmangement;

public class Admin {
    public String userName ;
    public String passward ;

    public Admin() {
        this.userName = "admin";
        this.passward = "admin";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    @Override
    public String toString() {
        return "Admin{" + "userName=" + userName + ", passward=" + passward + '}';
    }
    
    public int login(String userName,String passward){
        if(userName.equals(this.userName) && passward.equals(this.passward)){
            return 1;
        }
        else{
            return 0;
        }
    }
}
