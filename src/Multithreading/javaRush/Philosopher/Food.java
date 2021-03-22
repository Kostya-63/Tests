package Multithreading.javaRush.Philosopher;

public class Food {
    int foodCount;

    public Food(int foodCount) {
        this.foodCount = foodCount;
    }

    synchronized void minusFood(int measure) {
        foodCount = foodCount - measure;
    }

    public int getFoodCount() {
        return foodCount;
    }
}
