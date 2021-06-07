import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {   Organization org= new Organization();
        Admin adm=new Admin("Admin","6931006552",true);

        Beneficiary benef1=new Beneficiary("Benef1","6944858767");

        Beneficiary benef2=new Beneficiary("Benef2","6948395999");

        Donator donat=new Donator("Donator","6986811175");
        
        Scanner orgname = new Scanner(System.in);
        String organname=orgname.nextLine();
        Organization.getOrganization().setName(organname);
        
        Service fulaksh  = new Service("FULAKSH", "Details", 1);
        Service iatrikes  = new Service("IATRIKES", "Details", 2);
        Service noshleutikes  = new Service("NOSHLEUTIKES", "Details", 3);

        Material milk = new Material("Milk", "Details", 4);
        Material sugar = new Material("Sugar", "Details", 5);
        Material rice = new Material("Rice", "Details ", 6);

        Menu.getMenu();
    }
}