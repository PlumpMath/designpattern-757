package proxycglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by lvgm on 14-5-22.
 */
public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args,MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib before...");
        Object result=methodProxy.invokeSuper(obj, args);
        System.out.println("cglib after...");
        return result;
    }
}
