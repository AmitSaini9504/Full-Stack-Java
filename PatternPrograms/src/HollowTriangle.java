public class HollowTriangle {
    public static void main(String[] args) {

        int n = 5;
        int x = n;
        int y = n;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<(n*2)-1;j++)
            {
                if (j == x ||  j == y || i == n)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            x--;
            y++;
            System.out.println();
        }

    }
}