package builder;

/**
 * Created by lvgm on 14-5-21.
 */
public interface Builder {
    void buildId();
    void buildName();
    void buildMore();
    void buildChar();

    Product buildProduct();
}
