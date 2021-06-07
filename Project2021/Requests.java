public class Requests extends RequestDonationList{
    public void add(RequestDonation rd){setrdEntities(rd);}
    public void modify(double quantity){RequestDonation.getRequestDonation().setQuantity(quantity);}
    public void setQuantity(double quantity){};
    public int get(Entity entity){return entity.getId();}
    public void remove(RequestDonation rd){removerdEntities(rd);}
    public void monitor(){for(int c=0; c<rdEntitiesSize(); c++){System.out.println(getrdEntities(c));}}
    public void reset(){
        for (int i = 0; i<rdEntitiesSize(); i++){
            removerdEntitiesint(0);
        }
    }
}  