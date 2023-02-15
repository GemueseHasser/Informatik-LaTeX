import javax.swing.JFrame;

/**
 * Ein {@link Test} stellt eine Test-Klasse dar, welche ein leeres Fenster erzeugt und öffnet.
 */
public class Test {

    //<editor-fold desc="CONSTANTS">
    /** Die Breite dieses Fensters. */
    private static final int WIDTH = 500;
    /** Die Höhe dieses Fensters. */
    private static final int HEIGHT = 400;
    //</editor-fold>


    //<editor-fold desc="main">

    /**
     * Die Main-Methode dieser Anwendung.
     *
     * @param args Die Argumente, die von der JRE übergeben werden.
     */
    public static void main(final String[] args) {
        final JFrame frame = new JFrame("Test-Fenster");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        frame.setVisible(true);
    }
    //</editor-fold>

}
