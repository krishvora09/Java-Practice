public class Main {

    public static void main(String[] args) {

        Car car = new Car();

//        car.company = "Porsche";

        System.out.println("company = " + car.getCompany());
        System.out.println("model = " + car.getModel());
        System.out.println("color = " + car.getColor());
        System.out.println("doors = " + car.getDoors());
        System.out.println("Convertible = " + car.isConvertible());

        car.setCompany("Bugatti");
        car.setModel("Chirron");
        car.setColor("Black");
        car.setDoors(2);
        car.setConvertible(false);

//        car.setCompany("Maserati");

        System.out.println("company = " + car.getCompany());
        System.out.println("model = " + car.getModel());
        System.out.println("color = " + car.getColor());
        System.out.println("doors = " + car.getDoors());
        System.out.println("Convertible = " + car.isConvertible());

        car.describeCar();
    }
}
