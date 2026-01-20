package interfaces;

public class InterFce implements Animal
{

    public static void main(String[] args) {
        InterFce dog = new InterFce();
        dog.makeSound();
        dog.eat();
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");

    }
}

interface Animal {
    void makeSound();
    void eat();
}
