//wap to declare state variable field amd calls them in main funvtion using class name

public class Assignment4 {

    static  int variable = 10;

    public static void main(String[] args) {
        //calling directly from class

        System.out.println(Assignment4.variable);

        //modification
        Assignment4.variable = 20;
        System.out.println(Assignment4.variable);
    }
}
