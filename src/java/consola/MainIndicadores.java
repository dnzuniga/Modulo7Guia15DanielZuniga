/**
 * Resuelve la Guía 1.5 del módulo 7 "Integración Módulos de Software",
 * Programa CORFO "Mil Programadores".
 *
 * @autor Daniel Zúñiga Correa, 2017-12-21 (yyyy-mm-dd)
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
 * Contiene la primera versión del consumo de datos desde http://mindicador.cl
 *
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
