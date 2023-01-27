package EntryGate;

import ParkingSpot.ParkingSpot;
import ParkingSpot.ParkingSpotManager;
import Ticket.Ticket;
import Vehicle.Vehicle;

public class EntryGate {
    protected ParkingSpotManager parkingSpotManager;
    public Ticket CreateTicket(Vehicle vehicle, ParkingSpotManager parkingSpotManager,int CurrTime){
              int Id=parkingSpotManager.AddVehicle(vehicle);
              if(Id==-1){
                  System.out.println("Sorry No Parking Availble\n");
                  return null;
              }
              Ticket ticket=new Ticket(CurrTime,Id,vehicle);
              return ticket;
    }
}
