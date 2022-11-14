public class Temperature {
    
    public static double CelsiusToKelvin(double C){
        return C + 273.15;
    }

    public static double KelvinToCelsius(double K){
        return K - 273.15;
    }

    public static double FahrenheitToCelcius(double F){
        return (F-32)*(5/9);
    }

    public static double CelsiusToFahrenheit(double C){
        return C*(9/5) + 32;
    }

    public static double FahrenheitToKelvin(double F){
        return (F-32)*(5/9) + 273.15;
    }

    public static double KelvinToFahrenheit(double K){
        return (K-273.15) *(9/5) + 32;
    }

    public static void main(String[] args){
        System.out.print("25 degrees Celsius in Kelvin: "+ CelsiusToKelvin(25.0));
        System.out.println(" and Fahrenheit: " + CelsiusToFahrenheit(25.0));

        System.out.println("100 degrees Fahrenheit in Kelvin: "+FahrenheitToKelvin(100.0)+" and Celsius: "+FahrenheitToCelcius(100.0));

        System.out.println("0 degrees Kelvin in Celsius: "+KelvinToCelsius(0.0)+" and Fahrenheit: "+KelvinToFahrenheit(0.0));
    }
}
