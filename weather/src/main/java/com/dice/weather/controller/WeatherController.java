package com.dice.weather.controller;

import com.dice.weather.dto.WeatherDTO;
import com.dice.weather.service.IWeatherService;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value = {"/weather"})
public class WeatherController {

    @Autowired
    private IWeatherService weatherService;

    @RequestMapping(value = {"/summary"}, method = RequestMethod.GET)
    public String getWeatherDataByLocationName(@RequestParam("city") String city) throws IOException {

        WeatherDTO weatherDTO = WeatherDTO.builder().cityName(city).build();
        return weatherService.getForecastSummaryByLocationName(weatherDTO).string();

    }

    @RequestMapping(value = {"/hourly"}, method = RequestMethod.GET)
    public String getHourlyWeatherDataByLocationName(@RequestParam("city") String city) throws IOException {

        WeatherDTO weatherDTO = WeatherDTO.builder().cityName(city).build();
        return weatherService.getHourlyForecastSummaryByLocationName(weatherDTO).string();

    }
}
