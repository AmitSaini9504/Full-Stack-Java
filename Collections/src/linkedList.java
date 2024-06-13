
import java.util.ArrayList;
import java.util.Iterator;

public class linkedList<S> {
    public static void main(String[] args) {

        String[] arr = new String[5];
      //  linkedList<String> arrayList = new linkedList<S>();
/*
        for (int i = 0; i < 5; i++) {

            arrayList.add("Amit");
            arrayList.add("Divyanshu");
            arrayList.add("Jitesh");
            arrayList(arrayList);


            // arrayList.add(String.valueOf(45));
        }

        System.out.println(arrayList);

*/


    }

    private void add(String amit) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList(arrayList);
    }

    private static void arrayList(ArrayList<String> arrayList) {

        //add. : Add new String in array
        arrayList.add("Aalok");
        System.out.println(arrayList);

        //get. : print a perticular index's value
        System.out.println(arrayList.get(1));

        //set : set or changed  the value in a perticular index value
        arrayList.set(1,"Mishra Ji");
        System.out.println(arrayList);


        arrayList.add(2,"Sharma Ji");
        System.out.println(arrayList);

        arrayList.remove(2);

        System.out.println(arrayList);

        System.out.println(arrayList.size());

        for (String item : arrayList)
        {
            System.out.println("Items :" +item);
        }

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        arrayList.forEach(i ->
                {
                    System.out.println(i);
                }

        );

    }


}


