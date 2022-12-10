public class DriveD<D extends Truck> extends Driver {

    D car;

    public DriveD(String driverName, boolean drivingLicense, int drivingExperience, D car) {
        super(driverName, drivingLicense, drivingExperience);
        this.car = car;
    }

}