package com.dice.weather.service;

import com.dice.weather.dto.WeatherDTO;
import okhttp3.ResponseBody;

import java.io.IOException;

public interface IWeatherService {
    ResponseBody getForecastSummaryByLocationName(WeatherDTO weatherDTO) throws IOException;
    ResponseBody getHourlyForecastSummaryByLocationName(WeatherDTO weatherDTO) throws IOException;


}
