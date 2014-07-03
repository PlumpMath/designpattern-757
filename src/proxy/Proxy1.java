package proxy;

/**
 * Created by lvgm on 14-5-21.
 */
public class Proxy1 implements Subject{

    private Subject subject = null;
    /**
     * Constructor
     * @param filename
     */
    public Proxy1(Subject subject) {
        this.subject = subject;
    }

    /**
     * Displays the subject
     */
    @Override
    public void displayImage() {
        System.out.println("before...");
        subject.displayImage();
        System.out.println("after...");
    }
}
