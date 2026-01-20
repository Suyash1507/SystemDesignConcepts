package stratergyPattern;

public class Vehicle {
    DriveStratergy driveStratergy;

    public Vehicle(DriveStratergy driveStratergy) {
        this.driveStratergy = driveStratergy;
    }

    public void drive(){
        System.out.println("\n" + this.getClass().getSimpleName() + " is now:");
        driveStratergy.drive();
    }
}
