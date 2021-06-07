import java.util.ArrayList;

public class Donator extends User{
    public Donator(String name,String phone){
        super(name,phone);
    }
    private ArrayList<Offers> offerslist = new ArrayList<Offers>();
    
    static Donator don;
    public Donator(){don=this;}
    static Donator getDonator(){return don;}


    public int get(Entity entity){return entity.getId();}
    public void add(Offers off){offerslist.add(off);}
    public void remove(Offers off){offerslist.remove(off);}
    public void modify(double quantity){RequestDonation.getRequestDonation().setQuantity(quantity);}
    public void monitor(){for(int c=0; c<offerslist.size(); c++){System.out.println(offerslist.get(c));}}
    public void commit(){}
}