package singleton;

public class Singleton {
    private static Singleton INSTANCE;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (INSTANCE == null)
            INSTANCE = new Singleton(value);
        else
            INSTANCE.setValue(value);
        return INSTANCE;
    }
}