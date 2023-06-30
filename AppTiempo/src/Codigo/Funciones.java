package Codigo;


import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Funciones {
    public static JSONObject Conexion(String consulta) {
        JSONObject dataObject = null;
        try {
            URL url = new URL("http://api.weatherapi.com/v1/current.json?key=69962640d2e54a6198f201005233006&q="+consulta+"&aqi=no&lang=es");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int responsecode = con.getResponseCode();
            if (responsecode != 200) {
                System.out.println("Error " + responsecode);
            } else {
                StringBuilder informationstring = new StringBuilder();
                Scanner sc = new Scanner(url.openStream());
                while (sc.hasNext()) {
                    informationstring.append(sc.nextLine());
                }
                sc.close();
                dataObject = new JSONObject(String.valueOf(informationstring));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataObject;
    }
}
