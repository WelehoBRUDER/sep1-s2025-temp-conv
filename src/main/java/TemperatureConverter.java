import java.util.Scanner;

public class TemperatureConverter {

    public TemperatureConverter() {

    }

    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input unit (c, f, k): ");
        String temp = sc.nextLine();
        System.out.println("Enter value: ");
        double value = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter converted output unit (c, f, k): ");
        String to = sc.nextLine();
        if (temp.equalsIgnoreCase("c")) {
            if (to.equalsIgnoreCase("f")) {
                System.out.printf("%.2fC is %.2fF", value, tc.celsiusToFahrenheit(value));
            }
            else if (to.equalsIgnoreCase("k")) {
                System.out.printf("%.2fC is %.2fK", value, tc.celsiusToKelvin(value));
            }
        }
        else if (temp.equalsIgnoreCase("f")) {
            if (to.equalsIgnoreCase("c")) {
                System.out.printf("%.2fF is %.2fC", value, tc.fahrenheitToCelsius(value));
            }
            else if (to.equalsIgnoreCase("k")) {
                double conv = tc.celsiusToKelvin(tc.fahrenheitToCelsius(value));
                System.out.printf("%.2fF is %.2fK", value, conv);
            }
        }
        else if (temp.equalsIgnoreCase("k")) {
            if (to.equalsIgnoreCase("c")) {
                System.out.printf("%.2fK is %.2fC", value, tc.kelvinToCelsius(value));
            }
            else if (to.equalsIgnoreCase("f")) {
                double conv = tc.celsiusToFahrenheit(tc.kelvinToCelsius(value));
                System.out.printf("%.2fK is %.2fF", value, conv);
            }
        }
    }

    public double fahrenheitToCelsius(double fahrenheit) {
       return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }

    public double kelvinToCelsius(double kelvin) { return kelvin - 273.15; }

    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
