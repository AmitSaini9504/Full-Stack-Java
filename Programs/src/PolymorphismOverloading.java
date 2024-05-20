class Math{
    int add(int a,int b ){
        return a+b;
    }

    int add(int a , int b , int c){

        return  a+b+c;
    }
}


public class PolymorphismOverloading {

    public static void main(String[] args) {

        Math math = new Math();
        System.out.println(math.add(1,2));
        System.out.println(math.add(5,7,6));
    }


}
