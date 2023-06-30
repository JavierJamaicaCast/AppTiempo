package Ventanas;

import Codigo.Funciones;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame {
    private JPanel vPrincipal;
    private JLabel labelTituloEscriba;
    private JTextField textCiudad;
    private JButton botonPrincipal;


    public Principal() {
        setContentPane(vPrincipal);
        botonPrincipal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(Funciones.conneccion(textCiudad.getText()));
            }
        });
    }



}

