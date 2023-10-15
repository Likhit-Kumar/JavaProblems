class ThreadAlive implements Runnable {

    public void run() {
        System.out.println("Running [" +
            Thread.currentThread().getName() + "].");
    }

 
}
public class multi_thread {
public static void main(String[] args) {
    Thread t1 = new Thread(new ThreadAlive(), "FirstThread");
    Thread t2 = new Thread(new ThreadAlive(), "SecondThread");

    t1.start();

    if (t1.isAlive()) {
        System.out.format("%s is alive.%n", t1.getName());
    } else {
        System.out.format("%s is not alive.%n", t1.getName());
    }

    if (t2.isAlive()) {
        System.out.format("%s is alive.%n", t2.getName());
    } else {
        System.out.format("%s is not alive.%n", t2.getName());
     }
    }
}