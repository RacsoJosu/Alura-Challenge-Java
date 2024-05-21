package servicios;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Currency;
import models.Monedas;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Servicios {
    private Gson gson;

    public Servicios(){
        this.gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

    }
    public Currency obtenerDatos(Monedas moneda){
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(String.format("https://v6.exchangerate-api.com/v6/f66e1ded172ab5585abc25c2/latest/%s",moneda)))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            return new Gson().fromJson(response.body(), Currency.class);


        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }

    }

}
