package exam;

public class vegetable extends farmproduce {
    String season;
    boolean perishable;

    vegetable(int id,String name,double price,double stock,
        String farmer,String season,boolean perishable){
            super(id, name, price, stock, farmer);
            this.season=season;
            this.perishable=perishable;
        }
    double Discount(){
        return 0.10;
    }
    double paybleamount(double quantity){
        return pricePer()*quantity*0.90;
    }
    public void DisplayDetails(){
        super.DisplayDetails();
        System.out.println("Season: "+season);
        System.out.println("Perishable: "+perishable);
    }
}
