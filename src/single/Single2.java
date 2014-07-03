package single;

/**
 * Created by lvgm on 14-5-21.
 */
public class Single2 {

    private static Single2 single1 = null;

    private Single2() {
    }

    public static synchronized Single2 getNewInstance(){
        if(null == single1){
            single1 = new Single2();
        }
        return single1;
    }

    public void doSomething(){
        System.out.println("doing something also...");
    }

}
