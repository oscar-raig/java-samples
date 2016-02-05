package raig.org;


import javax.swing.JFrame;

public class MainWindow extends JFrame {
  private static final String MAIN_WINDOW_NAME = "ORC window name";

  public MainWindow() {
    super("Auction Sniper");
    setName(MAIN_WINDOW_NAME);
    setSize(500,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
  }
}
