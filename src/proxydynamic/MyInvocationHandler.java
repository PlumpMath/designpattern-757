package proxydynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lvgm on 14-5-22.
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object obj;
    public MyInvocationHandler(Object obj){
        this.obj=obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke before...");
        Object result=method.invoke(obj, args);//被代理对象方法的执行
        System.out.println("invoke after...");
        return result;
    }
}
