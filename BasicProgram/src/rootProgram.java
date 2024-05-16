import java.util.Scanner;

public class rootProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.print("Input Height : ");
        int height = sc.nextInt();

            if (height <= 1) {

                System.out.println("Animal is Short");

                System.out.println("Animal Cannot Squeak : Press 1  Animal can Squek press 2");

                int squeak = sc.nextInt();

                if (squeak == 1) {
                    System.out.println("Might be a squirrel");
                }
                if (squeak == 2) {
                    System.out.println("Might be rat");
                }


            } else if (height >= 2) {

                System.out.println("Animal is Tall...");

                System.out.println("Animal has short neck press 1 Animal has Long neck press 2");

                int neck = sc.nextInt();

                if (neck == 1) {
                    System.out.println("Short Nose press 1 Long Nose press 2");

                    int nose = sc.nextInt();

                    if (nose == 1) {
                        System.out.println("On Land press 1 In Water press 2");

                        int field = sc.nextInt();

                        if (field == 1) {
                            System.out.println("Might be rhinoceros");
                        }
                        if (field == 2) {
                            System.out.println("Might be a hippo");
                        }

                    } else if (nose == 2) {

                        System.out.println("Might be elephant");
                    }
                }
                if (neck == 2) {
                    System.out.println("Might be giraffe");
                }


            }
            System.out.println("Want to continue press 1");
            int operation = sc.nextInt();

            if (operation == 1)
            {
                continue;
            }
            else {
                break;
            }
        }

    }
}