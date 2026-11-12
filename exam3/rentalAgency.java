package exam3;
  import java.util.ArrayList;
public class rentalAgency {
     String name;
     String country;
     public rentalAgency(String name,String country){
        this.name=name;
        this.country=country;
     }
     public void showRentalDetails(){
        System.out.println("Name : "+name);
        System.out.println("Country: "+country);
     }

}
 class rentalVehicle extends rentalAgency {
   
    int VehicleID;
    String VehicleName;
    double RentalChargePerDay;
    int AvailableVehicleQuantity;
    String RentalDetails;
    static ArrayList<rentalVehicle> items = new ArrayList<>();
    static ArrayList<CartEntry> cart = new ArrayList<>();
    public rentalVehicle(String name,String country,int VehicleID,String VehicleName
        ,double RentalChargePerDay,int AvailableVehicleQuantity,
        String RentalDetails){
            super(name,country);
            this.VehicleID=VehicleID;
            this.VehicleName=VehicleName;
            this.RentalChargePerDay=RentalChargePerDay;
            this.AvailableVehicleQuantity=AvailableVehicleQuantity;
            this.RentalDetails=RentalDetails;
        }
    public int getVehicleId(){
        return VehicleID;
    }
    public String getVehicleName(){
        return VehicleName;
    }
    public double RentalCharge(){
        return RentalChargePerDay;
    }
    public int AvailableQuantity(){
        return  AvailableVehicleQuantity;
    }
    public String Rental(){
        return RentalDetails;
    }
    public double Amount(){
        return AvailableVehicleQuantity*RentalChargePerDay;
    }

    public void DisplayDetails(){
        System.out.println("Vehicle ID : "+VehicleID);
        System.out.println("Vehicle Name: "+VehicleName);
        System.out.println("Rental charge per Day: "+RentalChargePerDay);
        System.out.println("Available vehicle quanity : "+AvailableVehicleQuantity);
        System.out.println("Rental agency details: "+RentalDetails);
        System.out.println("Amount: "+Amount());
        super.showRentalDetails();
        System.out.println("----------------------------------");
    }
     public boolean compareObject(rentalVehicle other){
        return this.VehicleID==other.VehicleID;

    }
    static void searchproducebyId(rentalVehicle[] items,int id){
        for(rentalVehicle r : items){
            if(r.VehicleID==id){
                System.out.println("Vehicle is found.");
                r.DisplayDetails();
                return ;
            
            }
        }
        System.out.println("Vehicle not found");
    }
    static void searchbyName(rentalVehicle[] items,String name){
        for(rentalVehicle r : items){
            if(r.VehicleName.equalsIgnoreCase(name)){
                System.out.println("Name is found.");
                r.DisplayDetails();
                return;
            }
            }
        
            System.out.println("Name is not found");
    }
    static void DisplayElements(){
        double totalmodel=0;
        double physicalmodel=0;
        double availablefleet=0;

        for(rentalVehicle r : items){
            totalmodel+=r.VehicleID;
            availablefleet+=r.RentalChargePerDay;
        }
        System.out.println("Total nnumber of vehicle models: "+totalmodel);
        System.out.println("Total daily rental values: "+availablefleet);
    }
    

public double AmountForBooking(int quantity, int days) {
    return quantity * days * RentalChargePerDay;
}

static boolean bookingsConfirmed = false;

public static void addBooking(rentalVehicle vehicle, int quantity, int days) {

    if (bookingsConfirmed) {
        System.out.println("Booking rejected: Bookings already confirmed.");
    }
    else if (quantity <= 0) {
        System.out.println("Booking rejected: Quantity must be greater than zero.");
    }
    else if (days <= 0) {
        System.out.println("Booking rejected: Rental duration must be greater than zero.");
    }
    else {
        CartEntry existing = null;

        for (CartEntry entry : cart) {
            if (entry.vehicle.getVehicleId() == vehicle.getVehicleId()) {
                existing = entry;
                break;
            }
        }

        if (existing != null && existing.rentalDays != days) {
            System.out.println("Booking rejected: Different rental duration is not allowed.");
        }
        else {
            int alreadyBooked = 0;

            if (existing != null) {
                alreadyBooked = existing.bookedQuantity;
            }

            if (quantity + alreadyBooked > vehicle.AvailableQuantity()) {
                System.out.println("Booking rejected: Insufficient vehicles available.");
            }
            else {
                if (existing != null) {
                    existing.bookedQuantity += quantity;
                }
                else {
                    cart.add(new CartEntry(vehicle, quantity, days));
                }

                System.out.println("Booking accepted successfully.");
            }
        }
    }
}

public static void confirmBookings() {
    if (bookingsConfirmed) {
        System.out.println("Bookings have already been confirmed.");
    }
    else {
        for (CartEntry entry : cart) {
            entry.vehicle.AvailableVehicleQuantity -= entry.bookedQuantity;
        }

        bookingsConfirmed = true;
        System.out.println("Bookings confirmed. Inventory updated.");
    }
}


public static void displayCart() {
    int totalBooked = 0;

    System.out.println("\n===== RENTAL BOOKING CART =====");

    for (CartEntry entry : cart) {
        System.out.println("Vehicle Name: " + entry.vehicle.getVehicleName());
        System.out.println("Vehicle ID: " + entry.vehicle.getVehicleId());
        System.out.println("Booked Quantity: " + entry.bookedQuantity);
        System.out.println("Rental Days: " + entry.rentalDays);

        totalBooked += entry.bookedQuantity;
        System.out.println("-------------------------------");
    }

    System.out.println("Total Vehicles Booked: " + totalBooked);
}

    public static  void main(String[] args){
        rentalVehicle [] items = {
            new EconomyCars("Petrol", 5, "Subash", "India", 301, "Swift Economy car", 3000, 3, "City drive rentals"),
            new Motortcycle(150, true, "Nandan", "India", 302, "City computer bike", 800, 5, "RoadStar mobility"),
            new SUV(true, 7, "Suchay", "India", 303, "Adventure SUV", 5000, 2, "Travel wheels"),
            new Passengervan(10, true, "Akhil", "India", 304, "Family Traveller Van", 4000, 2, "MetroRide Services")
        };
    for(rentalVehicle r :items){r.DisplayDetails();}


    System.out.println("\n===== SEARCH PRODUCE =====");
    searchproducebyId(items, 301);
    searchbyName(items, "Nandan");
        
    
System.out.println("\n===== VALID BOOKING TESTS =====");

rentalVehicle.addBooking(items[0], 1, 2);
rentalVehicle.addBooking(items[1], 2, 2);
rentalVehicle.addBooking(items[2], 1, 2);
rentalVehicle.addBooking(items[3], 1, 2);

// Repeated booking: merge one more motorcycle
rentalVehicle.addBooking(items[1], 1, 2);

// Invalid quantity
rentalVehicle.addBooking(items[1], 0, 2);

// Invalid rental duration
rentalVehicle.addBooking(items[1], 1, 0);

// Invalid duration for an existing booking
rentalVehicle.addBooking(items[1], 1, 3);

// Invalid additional quantity
rentalVehicle.addBooking(items[1], 3, 2);

rentalVehicle.displayCart();

System.out.println("\n===== CONFIRM BOOKINGS =====");
rentalVehicle.confirmBookings();

System.out.println("\n===== REMAINING INVENTORY =====");
for (rentalVehicle r : items) {
    System.out.println(
        r.getVehicleName() + " - Available: " + r.AvailableQuantity()
    );
}


    }
}

class EconomyCars extends rentalVehicle{
    String FuelType;
    int Seatingcapacity;

    public EconomyCars(String FuelType,int Seatingcapacity,String name,String country,int VehicleID,String VehicleName
        ,double RentalChargePerDay,int AvailableVehicleQuantity,
        String RentalDetails){
            super(name,country,VehicleID,VehicleName,RentalChargePerDay,AvailableVehicleQuantity,RentalDetails);
            this.FuelType=FuelType;
            this.Seatingcapacity=Seatingcapacity;
        }
    @Override 
    public void DisplayDetails(){
        super.DisplayDetails();
        System.out.println("FuelType: "+FuelType);
        System.out.println("Seating Capacity: "+Seatingcapacity);
        
    }
    @Override 
   public double Amount(){
        double subtotal= AvailableVehicleQuantity*RentalChargePerDay;
        return subtotal - (subtotal * 0.1);
    }
}
class Motortcycle extends rentalVehicle{
    double Enginecapacity;
    boolean HelmetAvailabilty;
    public Motortcycle(double Enginecapacity,boolean HelmetAvaiabilty,String name,String country,int VehicleID,String VehicleName
        ,double RentalChargePerDay,int AvailableVehicleQuantity,
        String RentalDetails){
            super(name,country,VehicleID,VehicleName,RentalChargePerDay,AvailableVehicleQuantity,RentalDetails);
            this.Enginecapacity=Enginecapacity;
            this.HelmetAvailabilty=HelmetAvaiabilty;
        }
        @Override 
    public void DisplayDetails(){
        super.DisplayDetails();
        System.out.println("Enginecapacity: "+Enginecapacity);
        System.out.println("HelmetAvaiabilty: "+HelmetAvailabilty);
        
    }
    @Override 
   public double Amount(){
        double subtotal= AvailableVehicleQuantity*RentalChargePerDay;
        return subtotal;
    }
}

class SUV extends rentalVehicle{
    boolean fourWheel;
    int SeatingCapacity;
    public SUV(boolean fourWheel,int SeatingCapacity,String name,String country,int VehicleID,String VehicleName
        ,double RentalChargePerDay,int AvailableVehicleQuantity,
        String RentalDetails){
            super(name,country,VehicleID,VehicleName,RentalChargePerDay,AvailableVehicleQuantity,RentalDetails);
            this.fourWheel=fourWheel;
            this.SeatingCapacity=SeatingCapacity;
        }
        @Override 
    public void DisplayDetails(){
        super.DisplayDetails();
        System.out.println("Four-Wheel: "+fourWheel);
        System.out.println("Seating Capacity: "+SeatingCapacity);
        
    }
    @Override 
   public double Amount(){
        double subtotal= AvailableVehicleQuantity*RentalChargePerDay;
        return subtotal - (subtotal*0.15);
    }
}
class Passengervan extends rentalVehicle{
    double Passengercapacity;
    boolean AcAvailabilty;
    public Passengervan(double Passengercapacity,boolean AcAvailabilty,String name,String country,int VehicleID,String VehicleName
        ,double RentalChargePerDay,int AvailableVehicleQuantity,
        String RentalDetails){
            super(name,country,VehicleID,VehicleName,RentalChargePerDay,AvailableVehicleQuantity,RentalDetails);
            this.Passengercapacity=Passengercapacity;
            this.AcAvailabilty=AcAvailabilty;
        }
        @Override 
    public void DisplayDetails(){
        super.DisplayDetails();
        System.out.println("Passenger Capacity: "+Passengercapacity);
        System.out.println("Ac Availabilty: "+AcAvailabilty);
        
    }
    @Override 
   public double Amount(){
        double subtotal= AvailableVehicleQuantity*RentalChargePerDay;
        return subtotal - (subtotal*0.05);
    }
}

class VehicleCollection{
     static ArrayList<rentalVehicle> items = new ArrayList<>();
    int quantity;

    public VehicleCollection(int quantity){
        this.quantity=quantity;
    }
    public void displayVehicle(){
        for(rentalVehicle r : items){
            r.DisplayDetails();
        }
    }
}
    class CartEntry {
    rentalVehicle vehicle;
    int bookedQuantity;
    int rentalDays;

    public CartEntry(rentalVehicle vehicle, int bookedQuantity, int rentalDays) {
        this.vehicle = vehicle;
        this.bookedQuantity = bookedQuantity;
        this.rentalDays = rentalDays;
    }
}





    

