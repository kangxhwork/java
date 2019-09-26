package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String fn = JOptionPane.showInputDialog("enter the first number");
        String sn = JOptionPane.showInputDialog("enter the second number");

        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "sum of number is " + sum, "sum", JOptionPane.PLAIN_MESSAGE);
    }
}