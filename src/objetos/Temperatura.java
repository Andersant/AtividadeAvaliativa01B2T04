package objetos;

public class Temperatura {
    private double celsius;

    public Temperatura(double celsius) {
        setCelsius(celsius);
    }
    public double paraFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }
    public double paraKelvin() {
        return celsius + 273.15;
    }
    public double getCelsius() {
        return celsius;
    }
    public void setCelsius(double celsius) {
        if(celsius >= -273.15) {
            this.celsius = celsius;
        } else {
            System.out.println("Temperatura invalida! Nao pode ser menor que -273.15°C");
        }
    }
    public void mostrarTemperaturas() {
        System.out.printf("Temperatura em Celsius: %.2f\n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f\n", paraFahrenheit());
        System.out.printf("Temperatura em Kelvin: %.2f\n", paraKelvin());
    }
}