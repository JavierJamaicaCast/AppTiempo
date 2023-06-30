package Codigo;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Funciones {
    public static JSONObject conneccion(String consulta) {
        JSONObject dataObject = null;
        try {
            String pokemon = "pikachu";
            URL url = new URL("http://api.weatherstack.com/current?access_key=574f22bcfcfc16a6dcf0c9ae61000f60&query=" + consulta);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int responsecode = con.getResponseCode();
            if (responsecode != 200) {
                System.out.println("Error" + responsecode);
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
