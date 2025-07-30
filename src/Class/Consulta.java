package Class;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {
    public Conversion search(String moneda){
        URI url = URI.create("https://v6.exchangerate-api.com/v6/751ead8e6344ba38a594595d/latest/"+moneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(url).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (Exception e) {
            throw new RuntimeException("ERROR: la consulta [" + moneda +"] No es valida");
        }
    }
}
