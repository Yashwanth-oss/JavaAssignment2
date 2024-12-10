class MyThread extends Thread {
    
    // Constructor of MyThread
    public MyThread(String name) {
        // Call the base class (Thread) constructor using super
        super(name);
        // Start the thread
        start();
    }

    // Override the run method to define thread's behavior
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Child thread running: " + i);
            try {
                // Sleep for 500 milliseconds to simulate delay
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted");
            }
        }
        System.out.println(getName() + " - Child thread completed");
    }
}


public class Mainclaass {
    public static void main(String[] args) {
        // Create an instance of MyThread, starting the child thread
        MyThread childThread = new MyThread("ChildThread");

        // Main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Main thread running: " + i);
            try {
                // Sleep for 500 milliseconds to simulate delay
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread was interrupted");
            }
        }
        System.out.println("Main thread completed");
    }
    
}
