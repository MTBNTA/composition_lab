package garage.air;

import garage.Vehicle;

public class Plane extends Vehicle implements IAirVehicle {

    private boolean radar;
    private int numberOfCrew;
    private int numberOfPassengers;

    public Plane(boolean radar, int numberOfCrew, int numberOfPassengers, float weight, int maxSpeed){
        super(weight, maxSpeed);
        this.radar = radar;
        this.numberOfCrew = numberOfCrew;
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfCrew() {
        return numberOfCrew;
    }

    public void setNumberOfCrew(int numberOfCrew) {
        this.numberOfCrew = numberOfCrew;
    }

    @Override
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    @Override
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
