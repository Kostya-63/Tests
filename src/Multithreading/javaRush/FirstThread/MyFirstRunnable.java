package Multithreading.javaRush.FirstThread;

public class MyFirstRunnable implements Runnable{

    public MyFirstRunnable() {
    }

    @Override
    public void run() {
        System.out.println("I'm Runnable! My number = " + Thread.currentThread().getName());
    }
}
