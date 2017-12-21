/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author dnzun
 */
public class MainIndicadores {

    public static void main(String[] args) throws MalformedURLException, IOException {

        {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Indicador : ");
            String indicador = teclado.next();
            //Obtienen la URL donde está el recurso
            System.out.println("Obteniendo variaciones de " + indicador + "...");
            URL url = new URL("http://mindicador.cl/api" + "/" + indicador);
            System.out.println("Consumiendo JSON...");
//        Obtienen el objeto JSON a partir de un reader creado
//        desde un objeto stream que se obtiene a partir de la URL
            InputStream entrada = url.openStream();
            JsonReader reader = Json.createReader(entrada);
            JsonObject objeto = reader.readObject();
            for (int cont = 0; cont < objeto.getJsonArray("serie").size(); cont++) {
                System.out.println("Valor " + (cont + 1) + " : "
                        + objeto.getJsonArray("serie").getJsonObject(cont).get("valor"));
            }
        }
    }

}
