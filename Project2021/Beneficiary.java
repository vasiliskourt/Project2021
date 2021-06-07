import java.util.ArrayList;

public class Beneficiary extends User{
    
    private int noPersons = 1;
    private ArrayList<RequestDonation> receivedList = new ArrayList<RequestDonation>();
    private ArrayList<Requests> requestsList = new ArrayList<Requests>();
    public Beneficiary(String name,String phone){
        super(name,phone);
        
    }
    public ArrayList<RequestDonation> getReceivedList(){return receivedList;}
    static Beneficiary ben;
    public Beneficiary(){ben=this;}
    static Beneficiary getBeneficiary(){return ben;}

}
