package tightCoupling.java;

public class Traveller {
    Car car = null;
//    Bike bike = null;
//    Bicycle bicycle = null;

    public Traveller(){
        this.car = new Car();
//        this.bike = new Bike();
//        this.bicycle = new Bicycle();

    }

    public void startJourney(){
        this.car.move();
//        this.bike.move();
//        this.bicycle.move();

    }
}
