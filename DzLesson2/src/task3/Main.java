package task3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(10);
        Car car2 = new Car(10,140);
        Car car3 = new Car(10,140,1998);
        Car car4 = new Car(10,140,1998,"White");
        System.out.println("Машина 1: " + car1.year);
        System.out.println("Машина 2: " + car2.year + " " +  car2.speed);
        System.out.println("Машина 3: " + car3.year + " " + car3.speed + " " + car3.weight);
        System.out.println("Машина 4: " + car4.year + " " + car4.speed + " " + car4.weight +
                " " + car4.color);
    }

}
