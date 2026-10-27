package exam;

public class farmproduce {
    int produceID;
    String produceName;
    double pricePerKg;
    double availableKg;
    String farmerName;

    public farmproduce(int produce,String producename,
        double pricekg,double availkg,String farmer){
            produceID=produce;
            produceName=producename;
            pricePerKg=pricekg;
            availableKg=availkg;
            farmerName=farmer;
        }
    public int produceId(){
        return produceID;
    }
    public String Name(){
        return produceName;
    }
    public double pricePer(){
        return pricePerKg;
    }
    public double availableKg(){
        return availableKg;
    }
    public String fathername(){
        return farmerName;
    }
    public double Discount(){
        return 0.0;
    }
    void DisplayDetails(){
        System.out.println("ProduceID : "+produceID);
        System.out.println("ProduceName :"+produceName);
        System.out.println("PRICEPERKG : "+pricePerKg);
        System.out.println("Available KG's :"+availableKg);
        System.out.println("Farmer name :"+farmerName);
        System.out.println("-----------------------------------------");
    }
    public void setavailKg(double stock){
        availableKg=stock;
    }
    public double stockvalue(){
        return pricePerKg*availableKg;
    }
    public boolean issameProduce(farmproduce p){
        return this.produceID == produceID;
    }
}
