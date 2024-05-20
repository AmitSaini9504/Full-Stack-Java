interface Animal1{
    void sound();


}
class Dog implements Animal1
{
    @Override
    public void sound() {
        System.out.println("Woof");
    }
}


public class Interface {

    public static void main(String[] args) {
        Animal1 animal = new Dog();
        animal.sound();
    }
}
