package app;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        mywindow win = new mywindow();

        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(300, 300);
        win.setVisible(true);
    }
}