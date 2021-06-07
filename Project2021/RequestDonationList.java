import java.util.ArrayList;
public class RequestDonationList {
    private ArrayList<RequestDonation> rdEntities = new ArrayList<RequestDonation>();

    public void clearrdEntites(){rdEntities.clear();}
    public void setrdEntities(RequestDonation rd){rdEntities.add(rd);}
    public int rdEntitiesSize(){return rdEntities.size();}
    public ArrayList<RequestDonation> getrdEntitiesAll(){return rdEntities;}
    public RequestDonation getrdEntities(int i){return rdEntities.get(i);}
    public RequestDonation removerdEntitiesint(int i){return rdEntities.remove(i);}
    public void removerdEntities(RequestDonation rd){rdEntities.remove(rd);}
    public void setQuantity(double quantity){RequestDonation.getRequestDonation().setQuantity(quantity);};
    public int get(Entity entity){return entity.getId();}
    public void add(RequestDonation rd){rdEntities.add(rd);}
    public void remove(RequestDonation rd){rdEntities.remove(rd);}
    public void modify(double quantity){this.setQuantity(quantity);}
    public void monitor(){for(int c=0; c<rdEntities.size(); c++){System.out.println(rdEntities.get(c));}}
    public void reset(){
        for (int i = 0; i<rdEntities.size(); i++){
            rdEntities.remove(0);
        }
    }
}