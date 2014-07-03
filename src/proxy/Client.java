package proxy;

/**
 * Created by lvgm on 14-5-21.
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy("pic.jpg");
        proxy.displayImage();
        proxy.displayImage();

        Proxy1 proxy1 = new Proxy1(new Real("picture.jpg"));
        proxy1.displayImage();
    }
}
