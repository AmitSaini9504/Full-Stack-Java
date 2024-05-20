import java.util.Arrays;

public class JaggedArrays {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[2][];
        jaggedArray[0] = new int[]{1, 2};
        jaggedArray[1] = new int[]{3, 4, 5};

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();




        }
    }
}
