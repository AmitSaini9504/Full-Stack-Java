class AnimalInheritance{
    void eat()
    {
        System.out.println("Eating...");
    }
}

class  Dog3 extends AnimalInheritance
{
    void bark()
    {
        System.out.println("Barking....");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog3 dog3 = new Dog3();

        dog3.eat();
        dog3.bark();
    }
}
