//wap to add to number using parameter constructor
public class Assignment3 {
    int value1;
    int value2;
    int a = 10;
        int b = 20;
    //constructor
    public Assignment3(int a, int b) {
        value1 = a;
        this.value2 = b;

        int sum = value1 + value2;

        System.out.println(sum);
    }

        void printsum () {
           // System.out.println("Sum " + sum);
        }

    public static void main(String[] args) {
        Assignment3 addition = new Assignment3(5,7);
        //Assignment3.printsum();
    }
    }
