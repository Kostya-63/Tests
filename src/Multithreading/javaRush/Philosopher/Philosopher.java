package Multithreading.javaRush.Philosopher;

import java.util.concurrent.Semaphore;

class Philosopher extends Thread {

    private Food food;
    private final int measureOfHunger;
    private Semaphore sem;

    // поел ли философ
    private boolean full = false;

    private String name;

    Philosopher(Semaphore sem, String name, int measureOfHunger, Food food) {
        this.sem=sem;
        this.name=name;
        this.measureOfHunger = measureOfHunger;
        this.food = food;
    }

    public void run()
    {
        try
        {
            // если философ еще не ел
            if (!full) {
                //Запрашиваем у семафора разрешение на выполнение
                sem.acquire();
                System.out.println (name + " садится за стол");

                // философ ест
                sleep(300);
                full = true;

                food.minusFood(measureOfHunger);
                System.out.println (name + " поел! Он выходит из-за стола");
                System.out.println("Еды осталось - " + food.getFoodCount());

                sleep(300);
            }
        }
        catch(InterruptedException e) {
            System.out.println ("Что-то пошло не так!");
        }
        finally {
            // философ ушел, освободив место другим
            sem.release();
        }
    }
}