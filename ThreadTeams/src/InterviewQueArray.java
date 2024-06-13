import java.util.Arrays;

public class InterviewQueArray {

    public static void main(String[] args) {

        int arr [] = {78,56,48,10,45,60,10,52,45};

        int [] modifiedArr = new int [arr.length];
        int index = 0;

        for (int i=0;i<arr.length;i++) {
            if (arr[i] != 10) {
                modifiedArr[index] = arr[i];
                index++;
            }
        }

            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(modifiedArr));


    }
}