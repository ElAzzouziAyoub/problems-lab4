package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

  // Instance method to convert Celsius to Fahrenheit
  public double temperatureFahrenheit() {
    return (temperatureCelsius * 9 / 5) + 32;
  }

  // Instance method to get a formatted summary string
  public String getSummary() {
    return String.format(
        "Current weather: %.1f C (%.1f F) and %s",
        temperatureCelsius, temperatureFahrenheit(), conditions);

    //
  }

  // Static factory method to create a WeatherData record from Fahrenheit
  public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
    double celcius = (tempFahrenheit - 32) * (5 / 9);
    return new WeatherData(celcius, conditions);
  }

  public static void main(String[] args) {
    // Create using normal constructor (Celsius)
    WeatherData w1 = new WeatherData(25.0, "Sunny");
    System.out.println("Using Celsius constructor:");
    System.out.println(w1.getSummary());

    // Create using static factory method (Fahrenheit)
    WeatherData w2 = WeatherData.fromFahrenheit(77.0, "Cloudy");
    System.out.println("\nUsing fromFahrenheit factory method:");
    System.out.println(w2.getSummary());
  }
}
