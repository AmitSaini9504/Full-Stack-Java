public class Constructor {

    int SrNo;

    //constructor
    Constructor(int a)
    {
        this.SrNo = a;
        System.out.println("Default");
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor(12);
        Constructor obj2 = new Constructor(22);

        System.out.println("The serial no. of obj1 &  obj2 "+obj1.SrNo + " "+obj2.SrNo);


    }

}
