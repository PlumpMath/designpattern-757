package builder;

import com.sun.swing.internal.plaf.synth.resources.synth_sv;

/**
 * Created by lvgm on 14-5-21.
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director();
        Product product = director.constructProduct(builder);
        System.out.println(product);

        product = director.commonProduct(builder);
        System.out.println(product);

    }
}
