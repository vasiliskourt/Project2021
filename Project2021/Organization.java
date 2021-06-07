import java.util.ArrayList;
public class Organization {
    
    //Properties/Variables
    private String name;
    private Admin admin;
    private ArrayList<Entity> entityList = new ArrayList<Entity>();
    private ArrayList<Donator> donatorList = new ArrayList<Donator>();
    private ArrayList<Beneficiary> beneficiaryList = new ArrayList<Beneficiary>();
    private ArrayList<RequestDonation> currentDonations = new ArrayList<RequestDonation>();
    
    static Organization org;
    public Organization(){org=this;}
    static Organization getOrganization(){return org;}
    

    //Methods
    public ArrayList<Donator> getDonatorList(){return donatorList;}
    public ArrayList<Beneficiary> getBeneficiaryList(){return beneficiaryList;}
    public void setName(String name){this.name=name;}
    public void addcurrentDonations(RequestDonation rd){currentDonations.add(rd);}
    public ArrayList<RequestDonation> getCurrentDonationsAll(){return currentDonations;}
    public void setAdmin(Admin admin){this.admin=admin;}
    public Admin getAdmin(){return admin;}
    public void addEntity(Entity entity){
        entityList.add(entity);
    }
    public void removeEntity(Entity entity,boolean isAdmin){if (isAdmin=true){entityList.remove(entity);} }
        
    public void insertDonator(Donator donator){
        donatorList.add(donator);
    }
    public void removeDonator(Donator donator){
        donatorList.remove(donator);
    }
    public void insertBeneficiary(Beneficiary beneficiary){
        beneficiaryList.add(beneficiary);
    }
    public void removeBeneficiary(Beneficiary beneficiary){
        beneficiaryList.remove(beneficiary);
    }
    public void listEntities(){}
    
    public void listBeneficiaries(){
        System.out.println("Beneficiaries: " + beneficiaryList + "\n" + "Paroxes: " + Beneficiary.getBeneficiary().getReceivedList());  
    }
    public void listDonators(){
        System.out.println("Donators:" + donatorList);
    }


    


    


}
