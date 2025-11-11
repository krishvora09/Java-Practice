package dev.krishvora09;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        bird.move();
//        animal.move();
//        flier.move();             Error
//        tracked.move();           Error

//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();
//
//        inFlight(bird);
        inFlight(flier);
        inFlight(new Jet());
        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n",
                kmsTraveled, milesTraveled);

    }

    private static void inFlight(FlightEnabled flier) {

        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }
}
