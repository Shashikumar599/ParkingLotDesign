package Ticket;

import Vehicle.Vehicle;

public class TicketTwoWheel extends Ticket{


    TicketTwoWheel(int EntryTime , int ParkingSpotId , Vehicle vehicle ){
        super(EntryTime,ParkingSpotId,vehicle);
        this.FirstHour=10;
        this.NextHours=20;
    }

    public TicketTwoWheel() {
        super();
    }
}
