package Ticket;

import Vehicle.Vehicle;

public class TicketThreeWheel extends Ticket{
    public TicketThreeWheel(int EntryTime , int ParkingSpotId , Vehicle vehicle , int FirstHour , int NextHours){
        super(EntryTime,ParkingSpotId,vehicle);
        this.FirstHour=FirstHour;
        this.NextHours=NextHours;
    }
}
