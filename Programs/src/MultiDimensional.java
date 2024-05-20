public class MultiDimensional {

    public static void main(String[] args) {

        int[][] multirray = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i=0;i< multirray.length;i++)
        {
            for (int j=0;j<multirray[i].length;j++)
            {
                System.out.print(multirray[i][j] + " ");
            }
            System.out.println();



        }
    }
}
