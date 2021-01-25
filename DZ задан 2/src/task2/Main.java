package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну 1 ");
        double side1 = sc.nextDouble();
        System.out.println("Ведите длинну 2 ");
        double side2 = sc.nextDouble();
        System.out.println("ВЫвод 1 " + rec.areaCalculator(side1,side2));
        System.out.println("Вывод 2 " + rec.perimeterCalculator(side1, side2));
    }
}
