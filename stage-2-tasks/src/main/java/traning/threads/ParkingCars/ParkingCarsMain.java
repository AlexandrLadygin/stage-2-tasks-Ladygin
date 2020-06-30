package traning.threads.ParkingCars;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class ParkingCarsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество машиномест:");
        int numberOfPlaces = scanner.nextInt();
        Semaphore place = new Semaphore(numberOfPlaces);
        System.out.println("Введите количество автомобилей:");
        int numberOfCars = scanner.nextInt();

        Car [] cars = new Car[numberOfCars];

        for (int i = 0; i < numberOfCars ; i++) {
            cars[i] = new Car();
            cars[i].place =place;
            cars[i].start();
        }
    }
}
