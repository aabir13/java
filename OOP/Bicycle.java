//Code to understand the classic concept of Inheritance
class Bike {
    protected int gear;
    protected int speed;

    public Bike(int speed, int gear) {
        this.gear = gear;
        this.speed = speed;
    }

    public void setGear(int newVal) {
        gear = newVal;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}

class MountainBike extends Bike {
    public int seatHeight;

    public MountainBike(int startHeight, int startSpeed, int startGear) {
        super(startSpeed, startGear);
        seatHeight = startHeight;
    }

    public void setHeight(int newVal) {
        seatHeight = newVal;
    }
}

public class Bicycle {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 10, 1);
        System.out.println("GEAR: " + mountainBike.gear);
        System.out.println("SEAT HEIGHT: " + mountainBike.seatHeight);
        System.out.println("BIKE SPEED: " + mountainBike.speed);
        mountainBike.applyBrake(1);
        System.out.println("BIKE SPEED AFTER APPLYING BRAKES: " + mountainBike.speed);
    }
}