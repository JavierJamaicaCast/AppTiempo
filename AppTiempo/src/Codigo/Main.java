package Codigo;

import Ventanas.Principal;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)  {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        JFrame frame = new Principal();
        frame.setLocation(width / 3, height / 3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}