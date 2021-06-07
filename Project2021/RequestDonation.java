public class RequestDonation {
    private double quantity;
    private Entity entity;
    public RequestDonation (Entity entity){
    this.entity=entity;
}
    public double getQuantity(){return quantity;}
    public void setQuantity(double quantity){this.quantity=quantity;}
    static RequestDonation rq;
    public RequestDonation(){rq=this;}
    static RequestDonation getRequestDonation(){return rq;}
}
