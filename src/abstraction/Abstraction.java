package abstraction;

public class Abstraction {
    public static void main(String[] args) {
        Car c1 = new Audi();
        c1.Start();
        ((Audi) c1).Accelerate();
        Car c2 = new BMW();
        c2.Start();
        ((BMW) c2).Accelerate();
    }
}

class BMW extends Car{
    String model;
    int year;

    void Accelerate(){
        System.out.println("BMW is accelerating");
    }

    @Override
    void Start(){
        System.out.println("BMW is starting with a smooth purr");
    }
}

class Audi extends Car{
    String model;
    int year;

    void Accelerate(){
        System.out.println("Audi is accelerating");
    }

    @Override
    void Start(){
        System.out.println("Audi is starting with a roar");
    }
}


 abstract class Car{
//    int price;

    abstract void Start();
}