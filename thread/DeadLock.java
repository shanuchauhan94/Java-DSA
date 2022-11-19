package thread;

public class DeadLock {

    public static void main(String[] args) {
        String resource1 = "hello";
        String resource2 = "welcome";

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");

                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.err.println("exception 1 " + e.getMessage());
                }
                // for resource 2
                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        });

        Thread t2 = new Thread() {

            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.err.println("exception 2 " + e.getMessage());
                    }
                    // for resource 2
                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
