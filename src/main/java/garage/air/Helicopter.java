package garage.air;

import garage.Vehicle;

public class Helicopter extends Vehicle implements IAirVehicle {

    private boolean radar;
    private int propellerLength;
    private int numberOfPassengers;

    public Helicopter(boolean radar, int propellerLength, int numberOfPassengers, float weight, int maxSpeed){
        super(weight, maxSpeed);
        this.radar = radar;
        this.propellerLength = propellerLength;
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getPropellerLength() {
        return propellerLength;
    }

    public void setPropellerLength(int propellerLength) {
        this.propellerLength = propellerLength;
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
