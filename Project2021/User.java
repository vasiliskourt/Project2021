public abstract class User {
    private String name;
    private String phone;    
    public User(String name,String phone){
        this.name=name;
        this.phone=phone;
    }
    
    static User usr;
    public User(){usr=this;}
    static User getUser(){return usr;}
    public String getName(){return name;}
    public String getPhone(){return phone;}
    public void setName(String name){this.name=name;}
    public void setPhone(String phone){this.phone=phone;}


}

