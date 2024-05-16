//create a default constructor and print the name
public class Assignment2 {
    String name = "Amit";

    //constructor
    Assignment2(){
        System.out.print("My name is : ");

    }

    public static void main(String[] args) {
        Assignment2 constructor = new Assignment2();
        constructor.name = ("Amit");

        System.out.println(constructor.name);
    }

}
