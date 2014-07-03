package builder;

/**
 * Created by lvgm on 14-5-21.
 */
public class Director {
    public Product commonProduct(Builder builder) {
        builder.buildName();
        return builder.buildProduct();
    }

    public Product constructProduct(Builder builder) {
        builder.buildMore();
        builder.buildName();
        builder.buildChar();
        builder.buildId();
        return builder.buildProduct();
    }
}
