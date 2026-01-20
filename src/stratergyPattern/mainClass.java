package stratergyPattern;

public class mainClass {
    public static void main(String[] args) {
        Vehicle v1 = new SportsVehicle(new SportsDrive());
        v1.drive();
    }
}
