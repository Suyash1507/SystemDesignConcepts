package encapsulation;

public class encapsulationIntro {
    public static void main(String[] args) {
        Laptop lp = new Laptop();
        lp.ram = 16;
        // lp.price = 80000; // Error: price has private access in Laptop
        lp.setPrice(80000);
        lp.display();

    }

    public void doWork(){
        System.out.println("Doing work");
    }
}


class Laptop{
    int ram;
    private int price;

    public void setPrice(int price){
        this.price = price;
    }

    public void display(){
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Price: " + price);
    }

}
