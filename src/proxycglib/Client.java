package proxycglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by lvgm on 14-5-22.
 */
public class Client {
    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);

        enhancer.setCallback(new MyMethodInterceptor());

        Person p = (Person) enhancer.create();
        p.sayHello();

    }
}
