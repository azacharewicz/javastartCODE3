package zadanie2v2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class WeatherInfoComponent {

    List<WeatherInfo> createWeatherInfoList(List<String> citiesList) throws IOException{
        List<WeatherInfo> weatherInfoList = new ArrayList<WeatherInfo>();
        WeatherApi api = new WeatherApi();

        for (String city : citiesList) {
            int temperature = api.getTemperature(city);
            String description = api.getDescription(city);
            WeatherInfo weatherInfo = new WeatherInfo(city, description, temperature);

            weatherInfoList.add(weatherInfo);
        }

        return weatherInfoList;
    }

}
