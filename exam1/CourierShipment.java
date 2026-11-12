package exam1;
public class CourierShipment{
    int shipmentId;
    String destination;
    double weightKg;
    double ratePerKg;
    String courierCompany;

    public CourierShipment(int shipment,String drop,
        double weight,double rate,String company
    ){
        shipmentId=shipment;
        destination=drop;
        weightKg=weight;
        ratePerKg=rate;
        courierCompany=company;
    }

    public int ShipmentID(){
        return shipmentId;
    }
    public String Destination(){
        return destination;
    }
    public double Weight(){
        return weightKg;
    }
    public double RatePer(){
        return ratePerKg;
    }
    public String CourierCompany(){
        return courierCompany;
    }
    public double Shippingcharge(){
        return ratePerKg*weightKg;
    }
    public void DisplayDetails(){
        System.out.println("Shipment ID: "+shipmentId);
        System.out.println("Destination: "+destination);
        System.out.println("Weight in KG: "+weightKg);
        System.out.println("Rate Per KG: "+ratePerKg);
        System.out.println("Courier Company: "+courierCompany);
        System.out.printf("Shipping charge is :%.2f%n",Shippingcharge());
        System.out.println("-------------------------------");
    }
    
}
