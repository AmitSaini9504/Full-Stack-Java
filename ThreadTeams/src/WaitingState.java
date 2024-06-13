public class WaitingState {

    public static void main(String[] args) {
        Thread waitingThread = new Thread(new WaitingTask(),"Waiting Thread");
    }
}
