package Multithreading.javaRush;

public class ThreadExample2Yeld extends Thread {

    public ThreadExample2Yeld() {
        this.start();
    }

    public void run() {

        System.out.println(Thread.currentThread().getName() + " уступает свое место другим");
        Thread.yield();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has finished executing.");
    }

    public static void main(String[] args) {
        new ThreadExample2Yeld();
        new ThreadExample2Yeld();
        new ThreadExample2Yeld();
    }
}