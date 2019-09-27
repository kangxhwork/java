package app;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        //String fn = JOptionPane.showInputDialog("enter the first number");
        //String sn = JOptionPane.showInputDialog("enter the second number");

        //int num1 = Integer.parseInt(fn);
        //int num2 = Integer.parseInt(sn);
        // int sum = num1 + num2;
        // JOptionPane.showMessageDialog(null, "sum of number is " + sum, "sum", JOptionPane.PLAIN_MESSAGE);

        gui myGUI = new gui();
        myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myGUI.setSize(800, 800);
        myGUI.setVisible(true);
    }
}