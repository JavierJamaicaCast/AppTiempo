package Ventanas;

import Codigo.Funciones;

import javax.swing.*;


public class Principal extends JFrame {
    private JPanel vPrincipal;
    private JLabel labelTituloEscriba;
    private JTextField textCiudad;
    private JButton botonPrincipal;
    private JLabel labelDescTiempo;
    private JLabel descTiempo;
    private JLabel labelPrecipitacion;
    private JLabel labelTemperatura;
    private JLabel labelVelViento;
    private JLabel labelHumedad;
    private JLabel precipitacion;
    private JLabel temperatura;
    private JLabel humedad;
    private JLabel velViento;
    private JButton botonSalir;
    private JLabel labelTimeZone;
    private JLabel timeZone;
    private JLabel labelEstado;
    private JLabel estado;


    public Principal() {
        setContentPane(vPrincipal);
        botonPrincipal.addActionListener(e -> {

            if (textCiudad.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Tienes que poner una ciudad o localizacion");

            } else {
                labelHumedad.setVisible(true);
                labelDescTiempo.setVisible(true);
                labelPrecipitacion.setVisible(true);
                labelTemperatura.setVisible(true);
                labelVelViento.setVisible(true);
                labelTimeZone.setVisible(true);
                labelEstado.setVisible(true);
                temperatura.setText(Funciones.Conexion(textCiudad.getText()).getJSONObject("current").get("temp_c").toString() + "Cº");
                humedad.setText(Funciones.Conexion(textCiudad.getText()).getJSONObject("current").get("humidity").toString() + "%");
                descTiempo.setText(Funciones.Conexion(textCiudad.getText()).getJSONObject("current").getJSONObject("condition").get("text").toString());
                precipitacion.setText(Funciones.Conexion(textCiudad.getText()).getJSONObject("current").get("precip_mm").toString() + "mm");
                velViento.setText(Funciones.Conexion(textCiudad.getText()).getJSONObject("current").get("wind_kph").toString() + "km/h");
                timeZone.setText(Funciones.Conexion(textCiudad.getText()).getJSONObject("location").get("tz_id").toString());
                estado.setText(Funciones.Conexion(textCiudad.getText()).getJSONObject("location").get("region").toString());
            }

        });
        botonSalir.addActionListener(e -> System.exit(0));
    }


}

