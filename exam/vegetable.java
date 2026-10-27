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
        return 0.1;
    }
    double paybleamount(double quantity){
        return pricePerKg*quantity*0.1;
    }
    public void displayDetails(){
        System.out.println("Season: "+season);
        System.out.println("Perishable: "+perishable);
    }
}
