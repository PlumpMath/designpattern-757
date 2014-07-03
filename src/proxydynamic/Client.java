package proxydynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by lvgm on 14-5-22.
 */
public class Client {

    public static void main(String[] args) {
        Lenovo l=new Lenovo();
        InvocationHandler invocationHandler=new MyInvocationHandler(l);//动态代理联想
        //创建联想的代理对象lenovoSale
        Sales lenovoSale=(Sales) Proxy.newProxyInstance(l.getClass().getClassLoader(), l.getClass().getInterfaces(), invocationHandler);
        lenovoSale.sale();
    }

}
