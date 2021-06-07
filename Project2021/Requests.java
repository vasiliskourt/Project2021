public class Requests extends RequestDonationList{
    public void add(RequestDonation rd){setrdEntities(rd);}
    public void modify(double quantity){RequestDonation.getRequestDonation().setQuantity(quantity);}
    public void setQuantity(double quantity){};
    public int get(Entity entity){return entity.getId();}
    public void remove(RequestDonation rd){removerdEntities(rd);}
    public void monitor(){for(int c=0; c<rdEntitiesSize(); c++){System.out.println(getrdEntities(c));}}
    public void reset(){
        for (int i = 0; i<rdEntitiesSize(); i++){
            removerdEntitiesint(0); //na checkarei an xrhsimopoiei th dikia mas methodo remove h ths arraylist
            System.out.println("H lista upotithetai adeiase.");
            System.out.println("O arithmos deksia prepei na einai isos me mhden(an oxi uparxei provlima): " + rdEntitiesSize());
        }
    }
    //public void commit(int i){receivedlist.add(requestdonation?)}
}  