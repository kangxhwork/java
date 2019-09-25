package app;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


public class mywindow extends JFrame{

    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;

    public mywindow(){
        super("Title");
        setLayout(new FlowLayout());

        item1 = new JTextField("this is a text");
        add(item1);

        item2 = new JTextField("this is a text");
        add(item2);

        item3 = new JTextField("this is a text");
        item3.setEditable(false);
        add(item3);

        passwordField = new JPasswordField("type in your password here");
        add(passwordField);

        TextHandler handler = new TextHandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    private class TextHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String popupString = "";

            if (event.getSource() == item1){
                popupString = String.format("text value in that object is: %s", event.getActionCommand());
                JOptionPane.showMessageDialog(null, popupString);
            }
            else if (event.getSource() == passwordField){
                popupString = String.format("text value in that object is: %s", event.getActionCommand());
                JOptionPane.showMessageDialog(null, popupString);
            }
            
        }
    }
}