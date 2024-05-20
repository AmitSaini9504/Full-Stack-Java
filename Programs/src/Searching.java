import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {
        int arr[] = {5,7,8,9,3,5,6,2};

     try
     {
         Arrays.sort(arr);
         int index = Arrays.binarySearch(arr,5);
         System.out.println("Elements found at index of : "+index);
     }
     catch (ArrayIndexOutOfBoundsException outOfBoundsException)
     {
         System.out.print("Not available in list");
     }
    }
}
