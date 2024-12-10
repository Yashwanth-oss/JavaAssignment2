class MyRunnable implements Runnable {
    private String threadName;

    // Constructor to set thread name
    public MyRunnable(String name) {
        this.threadName = name;
    }

    // Override run method
    @Override
    public void run() {
        try {
            // Display thread starting message
            System.out.println(threadName + " is running");

            // Sleep for 500 milliseconds
            Thread.sleep(500);

            // Display thread resuming message
            System.out.println(threadName + " has resumed after sleeping for 500ms");

        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted");
        }
    }
}


public class Mainclas {
    public static void main(String[] args) {
        // Create instances of MyRunnable with different names
        MyRunnable runnable1 = new MyRunnable("Thread 1");
        MyRunnable runnable2 = new MyRunnable("Thread 2");

        // Create Thread objects and pass MyRunnable instances to them
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        // Start the threads
        thread1.start();
        thread2.start();
    }
    
}
