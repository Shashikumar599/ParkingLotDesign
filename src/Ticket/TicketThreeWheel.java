package Ticket;

import Vehicle.Vehicle;

public class TicketThreeWheel extends Ticket{
    public TicketThreeWheel(int EntryTime , int ParkingSpotId , Vehicle vehicle ){
        super(EntryTime,ParkingSpotId,vehicle);
        this.FirstHour=30;
        this.NextHours=50;
    }

    public TicketThreeWheel() {

    }
}
