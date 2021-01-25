package task2;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(10);
        Car car1 = new Car(15,"Blue");
        System.out.println("Лет: " + car.year);
        System.out.println("Лет: " + car1.year + " " + car1.color);

    }
}
