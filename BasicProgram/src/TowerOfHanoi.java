
    public class TowerOfHanoi {
        public static void main(String[] args) {
            int numDisks = 3; // Number of disks
            char leftPole = 'A'; // Leftmost pole
            char centerPole = 'B'; // Centre pole
            char rightPole = 'C'; // Rightmost pole

            towerOfHanoi(numDisks, leftPole, centerPole, rightPole);
        }

        public static void towerOfHanoi(int n, char left, char center, char destination) {
            if (n == 1) {
                System.out.println("Move disk 1 from pole " + left + " to pole " + destination);
                return;
            }

            towerOfHanoi(n - 1, left, destination, center);
            System.out.println("Move disk " + n + " from pole " + left + " to pole " + destination);
            towerOfHanoi(n - 1, center, left, destination);
        }
    }

