abstract class Ride {
    int distance = 10;
    abstract int calculateFare();
}

class BikeRide extends Ride {
    int calculateFare() { return distance * 5; }
}

class AutoRide extends Ride {
    int calculateFare() { return distance * 8; }
}

class CarRide extends Ride {
    int calculateFare() { return distance * 12; }
}

class Main8 {
    public static void main(String[] args) {
        Ride r;

        r = new BikeRide();
        System.out.println("Bike Fare: " + r.calculateFare());

        r = new AutoRide();
        System.out.println("Auto Fare: " + r.calculateFare());

        r = new CarRide();
        System.out.println("Car Fare: " + r.calculateFare());
    }
}