package builder;

/**
 * Created by lvgm on 14-5-21.
 */
public class ConcreteBuilder implements Builder {

    Product product;
    public ConcreteBuilder() {
        product = new Product();
    }

    @Override
    public void buildId() {
        product.setId(1);
    }

    @Override
    public void buildName() {
        product.setName("name1");
    }

    @Override
    public void buildMore() {
        product.setHasMore(true);
    }

    @Override
    public void buildChar() {
        product.setC('c');
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
