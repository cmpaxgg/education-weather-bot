package service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.SneakyThrows;
import model.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import service.WeatherService;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


import static service.ApiConstants.*;

@Service
public class WeatherServiceImpl implements WeatherService {

    @SneakyThrows
    public String getByCityName(String city) {


        var gson = new GsonBuilder().setPrettyPrinting().create();


        var httpClient = HttpClient.newBuilder()
                .build();
        System.out.println(city == null);
        var request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(GET_WEATHER_BY_CITY_URL + city + API_KEY_PARAM + API_KEY))
                .build();

        System.out.println("Sent URI: " + request.uri());
        var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        var weathers = gson.fromJson(response.body(), WeatherResponse.class);

        var responseStr = "Invalid input";

        if (weathers.data[0] != null) {
            responseStr = weathers.data[0].toString();
        }

        return responseStr;
    }

    class WeatherResponse {

        Weather[] data;

    }

    @Value("${api.key}")
    private String apiKey;

}

