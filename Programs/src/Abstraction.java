abstract class Animal{
    abstract void sound();
}
class dog extends Animal
{
    @Override
    void sound() {
        System.out.println("Woof");
    }
}

public class Abstraction{
public static void main(String[] args) {

    Animal myDog = new dog();
    myDog.sound();




}
}