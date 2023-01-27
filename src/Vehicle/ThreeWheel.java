package Vehicle;

public class ThreeWheel extends Vehicle{
    ThreeWheel(int Vehicle_Number ,String Owner ){
        super(Vehicle_Number,Owner);
        this.vehicleType=VehicleType.ThreeWheeler;
    }

}
