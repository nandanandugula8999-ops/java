package exam1;

public class shipment {
    static void ShipmentService(CourierShipment [] items){
        System.out.println("Total shipment categories are : "+items.length);  
    }
    static void RatePerService(CourierShipment [] items){
        for(CourierShipment c : items){
            System.out.println("Rate per Kg is : "+c.RatePer());
        }
    }
    static void HighestRate(CourierShipment [] items){
        CourierShipment highest = items[0];
        for(CourierShipment c : items){
            if(c.RatePer()>highest.RatePer()){
                highest=c;
            }
        }
        System.out.println("Highest rate service is : "+highest.shipmentId + "Rs- "+highest.ratePerKg);
    }
    static void LowestRate(CourierShipment [] items){
        CourierShipment lowest = items[0];
        for(CourierShipment c : items){
            if(c.RatePer()<lowest.RatePer()){
                lowest=c;
            }
        }
        System.out.println("Lowest rate service is : "+lowest.shipmentId + "Rs- "+lowest.ratePerKg);
    }
    static void SearchById(CourierShipment[] items,int id){
        for(CourierShipment c : items){
            if(c.ShipmentID()==id){
                System.out.println("Courier is found");
                c.DisplayDetails();
                return;
            }
        }
        System.out.println("Courier not found");
    }
    static void SearchByName(CourierShipment[] items,String name){
        for(CourierShipment c:items){
            if(c.CourierCompany().equalsIgnoreCase(name)){
                System.out.println("Cpourier is found");
                c.DisplayDetails();
            }
        }
        ;System.out.println("Courier not found");
    }
    public static void main(String[] args){
        CourierShipment [] items = {
            new CourierShipment(901, "Hyderabad", 5, 50, "Local Courier"),
            new CourierShipment(902, "Chennai", 3, 80, "National Courier"),
            new CourierShipment(903, "Mumbai", 8, 120, "Express Courier"),
            new CourierShipment(904, "Banglore", 8, 250, "International Courier")
        };
        for(CourierShipment c : items){
            c.DisplayDetails();
        }
        double total = 0;
        for(CourierShipment c : items){
            total+=c.Shippingcharge();
        }
        System.out.printf("Total Shipping charge is %.2f%n",total);
        HighestRate(items);
        LowestRate(items);
    }
}
