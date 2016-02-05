package raig.org;


import javax.swing.SwingUtilities;

public class Main {
  public static final String MAIN_WINDOW_NAME = "MAIN WINDOW NAME";
  public static final String SNIPER_STATUS_NAME = "SNIPER STATUS NAME";
  private MainWindow ui;

  public Main() throws Exception {
    startUserInterface();
  }

  public static void main(String... args) throws Exception {
    Main main = new Main();
  }

  private void startUserInterface() throws Exception {
    SwingUtilities.invokeAndWait(new Runnable() {
      public void run() {
        ui = new MainWindow();
      }
    });
  }
}
