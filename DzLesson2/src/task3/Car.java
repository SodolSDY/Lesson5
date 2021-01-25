package task3;

public class Car {
    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    int year;

    public Car(int year) {
        this.year = year;
    }

    double speed;
    int weight;
    String color;

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
