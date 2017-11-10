package zadanie2;

public class WeatherInfo {
    String city;
    String description;
    int temperature;

    public WeatherInfo(String city, String description, int temperature) {
        this.city = city;
        this.description = description;
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}


