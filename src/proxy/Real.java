package proxy;

/**
 * Created by lvgm on 14-5-21.
 */
public class Real implements Subject {


    private String filename = null;
    /**
     * Constructor
     * @param filename
     */
    public Real(final String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    /**
     * Displays the image
     */
    @Override
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }
}
