package Ticket;

import ParkingSpot.ParkingSpot;
import Vehicle.Vehicle;

public class Ticket {
    private int EntryTime;
    private int ExitTime;
    private int ParkingSpotId;
    private Vehicle vehicle;
    protected int FirstHour;
    protected int NextHours;

    public Ticket() {

    }
//    public void set(int EntryTime , int ParkingSpotId , Vehicle vehicle)
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public  Ticket(int EntryTime , int ParkingSpotId , Vehicle vehicle){
         this.EntryTime=EntryTime;
         this.ParkingSpotId=ParkingSpotId;
         this.vehicle=vehicle;
     }
     public int cost(int ExitTime){
        this.ExitTime=ExitTime;
        return FirstHour+(ExitTime-EntryTime)*NextHours;
     }

}
