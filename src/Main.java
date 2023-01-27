import EntryGate.EntryGate;
import ParkingSpot.ParkingSpot;
import ParkingSpot.ParkingSpotManager;
import ParkingSpot.ParkingSpotManager2;
import ParkingSpot.ParkingSpotManager3;
import Ticket.TicketTwoWheel;
import Ticket.Ticket;
import Vehicle.Vehicle;
import Vehicle.ThreeWheel;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ParkingSpotManager parkingSpotManager2=new ParkingSpotManager2();
        for(int i=0;i<10;i++){
            parkingSpotManager2.ParkingSpots.add(new ParkingSpot(i+1));
        }
        ParkingSpotManager parkingSpotManager3=new ParkingSpotManager3();
        for(int i=0;i<2;i++){
            parkingSpotManager3.ParkingSpots.add(new ParkingSpot(i+20));
        }
        Vehicle vehicle1=new ThreeWheel(1234 ,"P A");
        Ticket ticket1= EntryGate.CreateTicket(vehicle1 ,parkingSpotManager3,3);

        Vehicle vehicle2=new ThreeWheel(2341 ,"S K");
        Ticket ticket2= EntryGate.CreateTicket(vehicle2 ,parkingSpotManager3,3);

        Vehicle vehicle3=new ThreeWheel(3412 ,"T D");
        Ticket ticket3= EntryGate.CreateTicket(vehicle3 ,parkingSpotManager3,3);

        ExitGate.VehicleExit(ticket2,3,parkingSpotManager3);
    }
}