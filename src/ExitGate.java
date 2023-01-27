import ParkingSpot.ParkingSpotManager;
import Ticket.Ticket;
import Vehicle.Vehicle;

public class ExitGate {
    public void VehicleExit(Ticket ticket, int CurrTime , ParkingSpotManager parkingSpotManager){
        int payment=ticket.cost(CurrTime);
        Payment(payment);
        parkingSpotManager.RemoveVehicle(ticket.getVehicle());
    }
    void Payment(int payment)
    {
          System.out.println("Payment Recieved ");
    }
}
