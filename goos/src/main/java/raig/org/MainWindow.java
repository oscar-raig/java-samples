package raig.org;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;


public class MainWindow extends JFrame {

  public static final String SNIPER_STATUS_NAME = "statusLabelId" ;

  public static final String STATUS_JOINING = "STATUS JOINING";
  public static final String STATUS_LOST = "STATUS LOST";



  private final JLabel sniperStatus =
          createLabel(STATUS_JOINING);

  public MainWindow(String title) {
    super("Auction Sniper");
    setName(title);
    add(sniperStatus);
    setSize(500,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
  }

  public void showStatus(String status) {
    sniperStatus.setText(status);
  }

  private static JLabel createLabel(String initialText) {
    JLabel result = new JLabel(initialText);
    result.setName(SNIPER_STATUS_NAME);
    result.setBorder(new LineBorder(Color.BLACK));
    return result;
  }

}
