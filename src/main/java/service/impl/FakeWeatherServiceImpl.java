package service.impl;

import model.Weather;
import service.WeatherService;

import java.util.Map;

import static service.ApiConstants.NOT_FOUND_STATUS_CODE;
import static service.ApiConstants.OK_STATUS_CODE;

public class FakeWeatherServiceImpl {
//    public Weather getByCityName(String city) {
////        validateCityName(city);
//        WeatherResponse weatherResponse = fakeHttpClient(city);
//        Weather weather = null;
//        if(weatherResponse.statusCode!=NOT_FOUND_STATUS_CODE){
//            weather = weatherResponse.body;
//        }
//
//        return weather;
//    }
//
//    private WeatherResponse fakeHttpClient(String cityName) {
////        var lviv = new Weather("Lviv", "UA", 18);
////        var kyiv = new Weather("Kyiv", "UA", 20);
////        var odesa = new Weather("Odesa", "UA", 22);
//        var yalta = new Weather("Yalta", "UA", 25);
//        Map<String, Weather> cities = Map.of("lviv", lviv, "kyiv", kyiv, "odesa", odesa, "yalta", yalta);
//
//        var weather = cities.get(cityName.toLowerCase());
//
//        WeatherResponse weatherResponse = null;
//        if (weather == null) {
//            weatherResponse = new WeatherResponse(NOT_FOUND_STATUS_CODE, null);
//
//        } else {
//            weatherResponse = new WeatherResponse(OK_STATUS_CODE , weather);
//        }
//        return weatherResponse;
//    }
//
//    class WeatherResponse {
//        int statusCode;
//        Weather body;
//
//        public WeatherResponse(int statusCode, Weather body) {
//            this.statusCode = statusCode;
//            this.body = body;
//        }
//    }
}
