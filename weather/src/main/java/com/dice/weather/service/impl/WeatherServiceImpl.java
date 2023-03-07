package com.dice.weather.service.impl;

import com.dice.weather.dto.WeatherDTO;
import com.dice.weather.response.WeatherResponse;
import com.dice.weather.service.IWeatherService;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WeatherServiceImpl implements IWeatherService {

    @Override
    public ResponseBody getForecastSummaryByLocationName(WeatherDTO weatherDTO) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https:forecast9.p.rapidapi.com/rapidapi/forecast/" + weatherDTO.getCityName() +"/summary/")
                .get()
                .addHeader("X-RapidAPI-Key", "0320892ae4msh7c02b432f831ae4p149550jsnbf2582f1dd25")
                .addHeader("X-RapidAPI-Host", "forecast9.p.rapidapi.com")
                .build();

        Response response = client.newCall(request).execute();
        return response.body();
    }

    @Override
    public ResponseBody getHourlyForecastSummaryByLocationName(WeatherDTO weatherDTO) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://forecast9.p.rapidapi.com/rapidapi/forecast/" + weatherDTO.getCityName() + "/hourly/")
                .get()
                .addHeader("X-RapidAPI-Key", "0320892ae4msh7c02b432f831ae4p149550jsnbf2582f1dd25")
                .addHeader("X-RapidAPI-Host", "forecast9.p.rapidapi.com")
                .build();

        Response response = client.newCall(request).execute();
        return response.body();
    }



}
