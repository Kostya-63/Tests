package Multithreading.javaRush;
public class ThreadExampleJoin extends Thread {

    @Override
    public void run() {

        System.out.println("Начало работы потока " + getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток " + getName() +  " завершил работу.");
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadExampleJoin t1 = new ThreadExampleJoin();
        ThreadExampleJoin t2 = new ThreadExampleJoin();
        t1.start();

 /*Второй поток t2 начнет выполнение только после того, как будет завершен
       (или бросит исключение) первый поток - t1*/
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

        //Главный поток продолжит работу только после того, как t1 и t2 завершат работу
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Все потоки закончили работу, программа завершена");

    }
}