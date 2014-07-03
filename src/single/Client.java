package single;

/**
 * Created by lvgm on 14-5-21.
 */
public class Client {
    public static void main(String[] args) {
        Single1.getNewInstance().doSomething();
        Single2.getNewInstance().doSomething();
    }
}
