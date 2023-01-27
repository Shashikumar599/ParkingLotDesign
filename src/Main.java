import ParkingSpot.ParkingSpot;
import ParkingSpot.ParkingSpotManager;
import ParkingSpot.ParkingSpotManager2;
import ParkingSpot.ParkingSpotManager3;
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
    }
}