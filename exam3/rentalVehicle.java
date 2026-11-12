package exam3;

public class rentalVehicle extends rentalAgency {
    int VehicleID;
    String VehicleName;
    double RentalChargePerDay;
    int AvailableVehicleQuantity;
    String RentalDetails;

    public rentalVehicle(int VehicleID,String VehicleName
        ,double RentalChargePerDay,int AvailableVehicleQuantity,
        String RentalDetails){
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
    }
}
