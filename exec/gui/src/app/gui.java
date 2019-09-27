package app;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class gui extends JFrame{

    private JTextField textField;
    private JButton regButton;
    private JButton customButton;
    private JCheckBox boldBox ;
    private JCheckBox italicBox ;


    public gui(){
        super("The GUI title");
        setLayout(new FlowLayout());

        textField = new JTextField("this is a test string");
        add(textField);

        regButton = new JButton("reg button");
        add(regButton);

        Icon rIcon = new ImageIcon(getClass().getResource("r.png"));
        Icon gIcon = new ImageIcon(getClass().getResource("g.png"));

        customButton = new JButton("", rIcon);
        customButton.setRolloverIcon(gIcon);
        add(customButton);

        ButtonHandler buttonHandler = new ButtonHandler();
        regButton.addActionListener(buttonHandler);
        customButton.addActionListener(buttonHandler);

        boldBox = new JCheckBox("bold");
        italicBox = new JCheckBox("italic");
        
        CheckboxHandler checkboxHandler = new CheckboxHandler();
        italicBox.addItemListener(checkboxHandler);
        boldBox.addItemListener(checkboxHandler);

        add(boldBox);
        add(italicBox);
     }

    private class ButtonHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
        }
    }

    private class CheckboxHandler implements ItemListener {

        public void itemStateChanged(ItemEvent event){
            Font font = null;

            if (boldBox.isSelected() && italicBox.isSelected())
                font = new Font("Serif" , Font.BOLD + Font.ITALIC, 14);
            else if (boldBox.isSelected())
                font = new Font("Serif" , Font.BOLD , 14);
            else if (italicBox.isSelected())
                font = new Font("Serif" , Font.ITALIC , 14);
            else
                font = new Font("Serif" , Font.PLAIN , 14);

                textField.setFont(font);
        }
    }

}