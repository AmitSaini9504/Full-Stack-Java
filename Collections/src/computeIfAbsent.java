import java.util.HashMap;

//example from Javatpoint
public class computeIfAbsent {

    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();

        map.put("k1",100);
        map.put("k2",200);
        map.put("k3",300);
        map.put("k4",400);
        map.put("k5",500);
        map.put("k6",600);
        map.put("k7",700);

        System.out.println("Hashmap value \n" +map.toString());
        map.computeIfAbsent("K8",k-> 500);
        map.computeIfAbsent("K9",A-> 200+300);
        System.out.println(map);

        System.out.println("is 500 present ? :: " +map.containsValue(500));



    }
}
