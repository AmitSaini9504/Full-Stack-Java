public class ConcurrentHashMap {

    public static void main(String[] args) throws InterruptedException {
        // Create a ConcurrentHashMap
        java.util.concurrent.ConcurrentHashMap<String, Integer> map = new java.util.concurrent.ConcurrentHashMap<>();

        // Create multiple threads that perform concurrent operations on the map
        Thread writerThread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                map.put("key" + i, i);
            }
        });

        Thread writerThread2 = new Thread(() -> {
            for (int i = 10; i < 20; i++) {
                map.put("key" + i, i);
            }
        });

        Thread readerThread = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("ConcurrentHashMap Value for key" + i + ": " + map.get("key" + i));
            }
        });

        // Start the threads
        writerThread1.start();
        writerThread2.start();
        readerThread.start();

        // Wait for the threads to finish
        writerThread1.join();
        writerThread2.join();
        readerThread.join();
        System.out.println("Final size of map: " + map.size());
    }
}