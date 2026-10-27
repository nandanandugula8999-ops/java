package exam;

public class spice extends farmproduce {
    String spiceType;
    String origin;

    spice(int id,String name,double price,double stock,
        String farmer,String spiceType,String origin){
            super(id, name, price, stock, farmer);
            this.spiceType=spiceType;
            this.origin=origin;
        }

    double Discount(){
        return 0.12;
    }
    double paybleAmount(double quantity){
        return pricePer()*quantity*0.88;
    }
    public void DisplayDetails(){
        super.DisplayDetails();
        System.out.println("SpiceType : "+spiceType);
        System.out.println("Origin: "+origin);
    }
}
