package EntryGate;

import ParkingSpot.ParkingSpot;
import ParkingSpot.ParkingSpotManager;
import Ticket.Ticket;
import Vehicle.Vehicle;
import Ticket.Ticketfactory;
public class EntryGate {
    public static Ticket CreateTicket(Vehicle vehicle, ParkingSpotManager parkingSpotManager,int CurrTime){
              int Id=parkingSpotManager.AddVehicle(vehicle);
              if(Id==-1){
                  System.out.println("Sorry No Parking Availble\n");
                  return null;
              }
              Ticket ticket= Ticketfactory.ProvideTicket(CurrTime ,Id ,vehicle);
              System.out.println("Vehicle" +vehicle.getVehicle_Number() +" entered in Parking lot at " +Id  );
              return ticket;
    }
}
