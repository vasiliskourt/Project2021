public class Admin extends User{
    private boolean isAdmin=true;
    public Admin(String name,String phone,boolean isAdmin){
        super(name,phone);
        this.isAdmin=isAdmin;
    }
    public boolean getAdmin(){return isAdmin;}
}