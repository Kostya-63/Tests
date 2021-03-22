package Multithreading.javaRush.FirstThread;

public class RunFirst {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            MyFirstThread thread = new MyFirstThread();
            MyFirstRunnable runnable = new MyFirstRunnable();
            thread.setPriority(Thread.MAX_PRIORITY);
            //thread.setDaemon(true);
            thread.start();
            new Thread(runnable).start();

        }
    }
}