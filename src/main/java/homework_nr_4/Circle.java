package homework_nr_4;

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle: " + area);
    }

    public static void main(String[] args) {
        double radius = 9;
        Circle circle = new Circle(radius);
        circle.calculateArea();
    }
}
class TemperatureConverter {
    public static double toCelsius(double fahrenheit) {
        return fahrenheit / 2;
    }

    public static double toFahrenheit(double celsius) {
        return celsius * 2;
    }

    public static void main(String[] args) {
        double fahrenheit = 100;
        double celsius = 50;

        double convertedToCelsius = toCelsius(fahrenheit);
        double convertedToFahrenheit = toFahrenheit(celsius);

        System.out.println(fahrenheit + " degrees Fahrenheit = " + convertedToCelsius + " degrees Celsius");
        System.out.println(celsius + " degrees Celsius = " + convertedToFahrenheit + " degrees Fahrenheit");
    }
}