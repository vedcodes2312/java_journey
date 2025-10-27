// multithreading in java
// runnable interface implementation

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadExample2 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        // Thread t1 = new Thread(myRunnable, "Thread-1");
        // Thread t2 = new Thread(new MyRunnable(), "Thread-2");
        Thread thread = new Thread(myRunnable);
        thread.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// thread class vs runnable interface
// 1. thread class is used by extending it while runnable interface is implemented.
// 2. java supports single inheritance so if a class extends thread class it cannot extend any other class but if it implements runnable interface 
// it can extend another class as well.

// 3. thread class has more overhead as compared to runnable interface.
// 4. runnable interface is preferred when multiple threads are to be created as it separates the task and the thread management.
// 5. runnable interface is more flexible as the same runnable object can be passed to multiple thread objects.
// 6. thread class provides some additional methods like getName(), setName() etc. which are not present in runnable interface.
// 7. runnable interface is considered a better practice as it promotes composition over inheritance.
// 8. both can be used to achieve multithreading in java.
// 9. both have run() method which contains the code to be executed by the thread.
// 10. both can be used to create and start threads using the start() method of the thread class.
// 11. both can handle thread lifecycle methods like sleep(), join(), interrupt() etc.
// 12. both can be used to implement synchronization using synchronized keyword or locks.
// 13. both can be used to handle thread priorities using setPriority() and getPriority() methods of the thread class.
// 14. both can be used to handle thread groups using ThreadGroup class.
// 15. both can be used to handle uncaught exceptions using UncaughtExceptionHandler interface
// 16. both can be used to implement thread-local storage using ThreadLocal class.
// 17. both can be used to implement daemon threads using setDaemon() method of the thread class.
// 18. both can be used to implement thread pools using Executor framework.
// 19. both can be used to implement concurrency utilities using java.util.concurrent package.
// 20. both can be used to implement parallel processing using ForkJoin framework.
// 21. both can be used to implement reactive programming using CompletableFuture class.
// 22. both can be used to implement functional programming using lambda expressions and method references.
// 23. both can be used to implement modern Java features introduced in Java 8 and later versions.
// 24. both can be used to create high-performance and scalable applications in Java.
// 25. both have their own advantages and disadvantages and the choice between them depends on the specific use case and requirements of the application.
// 26. in general, runnable interface is preferred for better design and flexibility.
// 27. however, thread class can be used for simple and quick implementations where inheritance is not a concern.
// 28. ultimately, both are powerful tools for achieving multithreading in Java and can be used effectively based on the developer's preference and application needs.