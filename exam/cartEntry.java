package exam;

public class cartEntry {
    farmproduce produce;
    double quantity;

    public cartEntry(farmproduce produce,double quantity){
        this.produce=produce;
        this.quantity=quantity;
    }
    public void increaseProduce(double quantity){
        this.quantity+=quantity;
    }
    public double subtotal(){
        return produce.pricePer()*quantity;
    }
    public double discountPercentage(){
        return produce.Discount()*100;
    }
    public double discount(){
        return subtotal()*produce.Discount();
    }
    public double finalamount(){
        return subtotal()-discount();
    }

}
