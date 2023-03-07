# WeatherAPI
Created REST API using Java Spring from RapidAPI Weather API

This project has been built in gradle and all dependencies are present in build.gradle.


Authentication Method: Header-based authentication with random client id and
random client secret.
I have implemented this and without any key it will throw Unauthorized error.
![image](https://user-images.githubusercontent.com/31651811/223527247-a03aa696-6398-4ca5-a3fc-99b354c30d5f.png)



With any random client id or password it will accept the api like below -
 
API 1: Get the Weather forecast summary of Any city using API
(RapidApiGetForecastSummaryByLocationName)
In order to test this API you have to route '/weather/summary?city=cityname'
The Example result for this is shown below
![image](https://user-images.githubusercontent.com/31651811/223529551-1ec1e1d0-a45a-4447-9667-a4db17fd8842.png)


API 2: Get hourly Weather forecast details of Any city using API
(RapidApiGetHourlyForecastByLocationName)
(RapidApiGetForecastSummaryByLocationName)
In order to test this API you have to route '/weather/hourly?city=cityname'
The Example result for this is shown below
API Document: https://rapidapi.com/wettercom-wettercom-default/api/forecast9
(RapidApiGetForecastSummaryByLocationName &
RapidApiGetHourlyForecastByLocationName)
![image](https://user-images.githubusercontent.com/31651811/223529125-ea22daee-5694-42a2-aa19-c09214a26f86.png)




