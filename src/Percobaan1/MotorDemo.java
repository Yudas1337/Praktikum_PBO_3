package Percobaan1;

public class MotorDemo {

    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.kecepatan = 20;
        motor.kontakOn = true;
        motor.printStatus();

    }
}
