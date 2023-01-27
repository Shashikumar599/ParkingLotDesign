package Ticket;

import Vehicle.Vehicle;

public class TicketTwoWheel extends Ticket{


    TicketTwoWheel(int EntryTime , int ParkingSpotId , Vehicle vehicle , int FirstHour , int NextHours){
        super(EntryTime,ParkingSpotId,vehicle);
        this.FirstHour=FirstHour;
        this.NextHours=NextHours;
    }
}
