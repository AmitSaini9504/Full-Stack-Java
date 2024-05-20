
class Animal2
{
    void sound()
    {
        System.out.println("Animal Sound");
    }
}

class Dog1 extends Animal2
{
    void sound()
    {
        System.out.println("Woof");
    }
}
public class PolymorphismOverriding {

    public static void main(String[] args) {
        Animal2 animal= new Dog1();
        animal.sound();
    }
}
