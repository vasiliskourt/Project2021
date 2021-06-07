import java.util.Scanner;
public class Menu
{
   private static boolean running1,running2,running3 = true;
   
   private static String cellphone;
   private String MaterialOrServices;
   public static void getMenu()
   {
   while (running1==true)
   {
      System.out.println("Welcome to our website! Please input your cellphone to continue.");
      Scanner line= new Scanner(System.in);
      String cellphone = line.nextLine();}
      Beneficiary ben=new Beneficiary("name",cellphone);
      Donator don=new Donator("name",cellphone);
      while(running2==true)
      {
         if(Organization.getOrganization().getDonatorList().contains(don))
         {
            System.out.println("Welcome " + Beneficiary.getBeneficiary().getName() +"to our organization named 'Project'. \n What would you like to do today?");
            System.out.println("1.Add offer.\n2.Show offers.\n3.Commit.\n4.Back.\n5.Logout.\n6.Exit.");
            System.out.println("Please choose a number between 1 and 6.");
            Scanner input1 = new Scanner(System.in);
            String select=input1.nextLine();
            while(Integer.valueOf(select)<1 || Integer.valueOf(select)>6)
            {
               System.out.println("Invalid value, please try again.");
               System.out.println("1.Add request.\n2.Show requests.\n3.Commit.\n4.Back.\n5.Logout.\n6.Exit.");
               System.out.println("Please choose a number between 1 and 6.");
               select=input1.nextLine();
            }
            while(running3==true)
            {
               switch(select)
               {
                  case "1":
                  System.out.println("Materials Available:");
               
                  System.out.println("Select 1 for Material and 2 for Services.");
                  Scanner inputMOrS=new Scanner(System.in);
                  String materialOrService=inputMOrS.nextLine();
                  if (materialOrService=="1")
                  {
                     
                  }
                  else if (materialOrService=="2")
                  {

                  }
                  case "2":
                  case "3":
                  case "4":
                  running3=false;
                  case "5":
                  running2=false;
                  running3=false;
                  case "6":
                  running1=false;
                  running2=false;
                  running3=false;
               
               }
            }
      }
         else if(Organization.getOrganization().getBeneficiaryList().contains(ben))
         {  
            System.out.println("Welcome " + Beneficiary.getBeneficiary().getName() + " to our organization 'Project'.\n What would you like to do today?");
            System.out.println("1.Add requests.\n2.Show request.\n3.Commit.\n4.Back.\n5.Logout.\n6.Exit.");
            System.out.println("Please choose a number between 1 and 6.");
            Scanner input1 = new Scanner(System.in);
            String select=input1.nextLine();
            while (Integer.valueOf(select)<1 || Integer.valueOf(select)>6)
            {
               System.out.println("Invalid value, please try again.");
               System.out.println("1.Add request.\n2.Show requests.\n3.Commit.\n4.Back.\n5.Logout.\n6.Exit.");
               System.out.println("Please choose a number between 1 and 6.");
               select=input1.nextLine();
            }
            switch(select)
            {
               case "1":
                  System.out.println("Select 1 for Material and 2 for Service.");
                  Scanner inputMOrS=new Scanner(System.in);
                  String materialOrService=inputMOrS.nextLine();
               case "2":
                  System.out.println("Your requests are: ");
               case "3":
               case "4":
               running3=false;
               case "5":
               running2=false;
               running3=false;
               case "6":
               running1=false;
               running2=false;
               running3=false;
            }
         }
         //else if (getAdmin() == true){}
      
         else
         {
            System.out.println("You are not registered yet! Would you like to be a part of our company?Type y to register and n to exit the program.");
            Scanner input2 = new Scanner(System.in);
            String select=input2.nextLine();
            if(select=="y")
            {
               System.out.println("Would you like to be a donator or a beneficiary? Type 1 to register as a donator and 2 to register as a beneficiary.");
               select=input2.nextLine();
               if(select=="1")
               {
                  System.out.println("Please input your name.");
                  select=input2.nextLine();
                  Donator don2=new Donator(select,cellphone);
                  Organization.getOrganization().insertDonator(don2);

               }
               else if(select=="2")
               {
                  System.out.println("Please input your name.");
                  select = input2.nextLine();
                  Beneficiary ben2 = new Beneficiary(select,cellphone);
                  Organization.getOrganization().insertBeneficiary(ben2);
               }
            }
         }
      }
   }
}

      
      