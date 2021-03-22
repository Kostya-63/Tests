package PatternyAlgorythmy.Patterns;

public class LazySynchronizedSingleton {
    private static LazySynchronizedSingleton singleton;
    private LazySynchronizedSingleton(){}

    public static synchronized LazySynchronizedSingleton getSingleton() {
        if (singleton == null) {
            singleton = new LazySynchronizedSingleton();
        }
        return singleton;
    }
}
