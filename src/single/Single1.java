package single;

/**
 * Created by lvgm on 14-5-21.
 */
public class Single1 {

    private static Single1 single1 = new Single1();

    private Single1() {
    }

    public static Single1 getNewInstance(){
        return single1;
    }

    public void doSomething(){
        System.out.println("doing something...");
    }

}
