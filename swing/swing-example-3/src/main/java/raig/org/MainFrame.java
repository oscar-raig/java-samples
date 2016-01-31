package raig.org;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame  extends JFrame{

    DetailsPanel detailsPanel;

    public MainFrame(String title) {
        super(title);

        detailsPanel = new DetailsPanel();

        setLayout(new BorderLayout());

        final JTextArea textArea = new JTextArea();
        JButton button = new JButton("Click me!");

        Container container = getContentPane();

        container.add(textArea,BorderLayout.CENTER);
        container.add(button, BorderLayout.SOUTH);

        container.add(detailsPanel, BorderLayout.WEST);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Hello\n");
            }
        });

    }
}
