package PatternyAlgorythmy.Patterns;

//@javax.inject.Singleton //для JEE - пишем и за синглтоном следит спринг
public class Singleton {
    private static volatile Singleton instance = null; //здесь обязательно нужен волатайл иначе будут ошибки, потому что модель памяти позволяет увидеть не инициализированный объект
    private static final Object lock = new Object();
    private static boolean isInitialized = false;

    public Singleton getInstance() {
        if(!isInitialized) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new Singleton();
                    isInitialized = true;
                }
            }
        }
        return instance;
    }
}
