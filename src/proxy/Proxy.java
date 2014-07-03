package proxy;

/**
 * Created by lvgm on 14-5-21.
 */
public class Proxy implements Subject{

    private Real subject = null;
    private String filename = null;
    /**
     * Constructor
     * @param filename
     */
    public Proxy(final String filename) {
        this.filename = filename;
    }

    /**
     * Displays the subject
     */
    @Override
    public void displayImage() {
        if (subject == null) {
            subject = new Real(filename);
        }
        subject.displayImage();
    }
}
