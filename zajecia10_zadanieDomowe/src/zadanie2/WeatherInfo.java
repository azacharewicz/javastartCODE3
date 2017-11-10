package zadanie2;

public class WeatherInfo {
    private String city;
    private String description;
    private int temperature;

    protected WeatherInfo(){}

    protected WeatherInfo(String city, String description, int temperature) {
        this.city = city;
        this.description = description;
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public String getDescription() {
        return description;
    }

    public int getTemperature() {
        return temperature;
    }
}


