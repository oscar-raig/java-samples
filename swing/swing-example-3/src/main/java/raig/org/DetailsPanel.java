package raig.org;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


public class DetailsPanel extends JPanel {

    private final GridBagConstraints gridBagConstraints;

    public DetailsPanel(){

        Dimension dimension = getPreferredSize();
        dimension.width = 250;
        setPreferredSize(dimension);

        setBorder(BorderFactory.createTitledBorder("Personal details"));







        setLayout(new GridBagLayout());

        gridBagConstraints = new GridBagConstraints();

        createAndPlaceLabels();
        createAndPlaceFields();
        createAndPlaceButton();




    }

    private void createAndPlaceButton() {
        JButton addButton = new JButton("Add");
        gridBagConstraints.weighty = 10;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
        add(addButton, gridBagConstraints);
    }

    private void createAndPlaceLabels() {
        JLabel nameLabel = new JLabel("Name:");
        JLabel occupationLabel = new JLabel("Occupation:");

        gridBagConstraints.anchor = GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;

        add(nameLabel, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;

        add(occupationLabel, gridBagConstraints);
    }

    private void createAndPlaceFields(){
        JTextField nameField =  new JTextField(10);
        JTextField occupationField = new JTextField(10);

        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;

        add(nameField, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;

        add(occupationField, gridBagConstraints);
    }
}
