package traning.threads.ParkingCars;


import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

class Car extends Thread {
    Semaphore place;
    Random rnd = new Random();

    public void run() {
        System.out.println(this.getName() + " заезжает на парковку");
        try {
            boolean result = this.place.tryAcquire(1,6000, TimeUnit.MILLISECONDS);
            if (result == false){
                System.out.println(this.getName() + " не стал ждать и уехал");
                return;
            }
            System.out.println(this.getName() + " паркуется на свободное место...");
            int k = this.rnd.nextInt(7000) + 3000;
            if (k < 6000) {
                System.out.println(this.getName() + " будет стоять " + k + " милисекунд");
                sleep((long)k);
                System.out.println(this.getName() + " освободил место и уехал");
                this.place.release();
            } else {
                System.out.println(this.getName() + " будет очень долго припаркован: " + k + " милисекунд");
            }
        } catch (InterruptedException var2) {
            var2.printStackTrace();
        }
    }
}