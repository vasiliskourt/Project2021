public class Offers extends RequestDonationList{
    public void commit(){for (int i=0; i<rdEntitiesSize(); i++)
        Organization.getOrganization().addcurrentDonations(getrdEntities(i));
        if (getrdEntitiesAll().equals(Organization.getOrganization().getCurrentDonationsAll())){clearrdEntites();}
    }
    
    static Offers off;
    public Offers(){off=this;}
    static Offers getOffers(){return off;}  
}
