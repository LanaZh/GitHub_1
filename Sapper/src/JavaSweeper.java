import javax.swing.*;

public class JavaSweeper  extends JFrame {

    public static void main (String[] arg) {
        new JavaSweeper().setVisible(true);
    }

    public JavaSweeper () {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         setTitle("Sapper");
         setLocation(null);
         setVisible(true);
         setResizable(false);
    }
}
