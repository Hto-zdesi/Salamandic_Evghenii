package homework_nr_4;

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь круга: " + area);
    }

    public static void main(String[] args) {
        double radius = 9;
        Circle circle = new Circle(radius);
        circle.calculateArea();
    }
}
class TemperatureConverter {
    public static double toCelsius(double Фаренгейта) {
        return Фаренгейта / 2;
    }

    public static double toFahrenheit(double Цельсия) {
        return Цельсия * 2;
    }

    public static void main(String[] args) {
        double fahrenheit = 100;
        double celsius = 50;

        double convertedToCelsius = toCelsius(fahrenheit);
        double convertedToFahrenheit = toFahrenheit(celsius);

        System.out.println(fahrenheit + " градусов Фаренгейта = " + convertedToCelsius + " градусов Цельсия");
        System.out.println(celsius + " градусов Цельсия = " + convertedToFahrenheit + " градусов Фаренгейта");
    }
}