package zadanie2v2;

class WeatherInfo {
    private String city;
    private String description;
    private int temperature;

    WeatherInfo(String city, String description, int temperature) {
        this.city = city;
        this.description = description;
        this.temperature = temperature;
    }

    String getCity() {
        return city;
    }

    String getDescription() {
        return description;
    }

    int getTemperature() {
        return temperature;
    }
}

