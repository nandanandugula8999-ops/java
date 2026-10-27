package exam;

public class grain extends farmproduce {
    String grainType;
    Boolean organic;
    
    grain(int id,String name,double price,double stock,
        String farmer,String type,boolean organic){
            super(id, name, price, stock, farmer);
            grainType=type;
            this.organic=organic;
        }
    double Discount(){
        return 0.05;
    }
    double paybleamount(double quantity){
        return pricePer()*quantity*0.95;
    }
    public void DisplayDetails(){
        super.DisplayDetails();
        System.out.println("Grain-Type :"+grainType);
        System.out.println("Organic: "+organic);
    }
    
}
