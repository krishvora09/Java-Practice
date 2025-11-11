package dev.krishvora09;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        bird.move();
        animal.move();
//        flier.move();             Error
//        tracked.move();           Error

        flier.takeOff();
        flier.fly();
        tracked.track();
        flier.land();
    }
}
