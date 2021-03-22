package Multithreading.javaRush.Philosopher;

import java.util.concurrent.Semaphore;

class Main {

    public static void main(String[] args) {

        Food food = new Food(10);

        Semaphore sem = new Semaphore(2);
        new Philosopher(sem,"Сократ", 2, food).start();
        new Philosopher(sem,"Платон", 2, food).start();
        new Philosopher(sem,"Аристотель", 2, food).start();
        new Philosopher(sem,"Фалес", 2, food).start();
        new Philosopher(sem,"Пифагор", 2, food).start();
    }
}
