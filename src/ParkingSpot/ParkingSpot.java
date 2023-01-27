package ParkingSpot;
import Vehicle.Vehicle;
public class ParkingSpot {
    boolean isempty;
    Vehicle vehicle;

    int Id;
    int Price;

    ParkingSpotType parkingSpotType;

    public ParkingSpot(int Id ){
        this.Id=Id;
    }
    public void Add(Vehicle vehicle){
        this.isempty=false;
        this.vehicle=vehicle;
    }
    public void Remove(Vehicle vehicle){
        this.isempty=true;
        this.vehicle=vehicle;
    }
}
