// Question no 19
// Write a Java program to demonstrate a static method that converts temperature from Celsius to Fahrenheit.

class question19 {

    static double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        double celsius = 30;

        double fahrenheit = convertToFahrenheit(celsius);

        System.out.println("Fahrenheit = " + fahrenheit);
    }
}