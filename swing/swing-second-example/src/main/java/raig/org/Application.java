package raig.org;


import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Application {


  public static void main(String [] args) {

    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        JFrame jFrame = new MainFrame("First Frame");

        jFrame.setSize(500,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
      }
    });


  }

}
