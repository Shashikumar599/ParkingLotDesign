package Ticket;

import Vehicle.Vehicle;
import Vehicle.VehicleType;

public class Ticketfactory {
    public static Ticket ProvideTicket(int EntryTime , int ParkingSpotId ,Vehicle vehicle){
        if(vehicle.getVehicleType().equals(VehicleType.TwoWheeler)){
            return new TicketTwoWheel(EntryTime ,ParkingSpotId ,vehicle);
        }
        else {
            return new TicketThreeWheel(EntryTime ,ParkingSpotId ,vehicle);
        }
    }
}
