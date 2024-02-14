package garage.land;

import garage.engine.IEngine;
import garage.Vehicle;

public class Bus extends Vehicle implements ILandVehicle, IEngine {

    private boolean isDoubleDecker;
    private int numberOfWheels;
    private IEngine engine;  // interface being passed in as an object, bus can has electric or combustion engine

    public Bus(float weight, int maxSpeed, boolean isDoubleDecker, IEngine engine){
        super(weight, maxSpeed);
        this.isDoubleDecker = isDoubleDecker;
        this.numberOfWheels = 8;
        this.engine = engine;
    }

    // getter and setter for horsepower because we added garage.engine.IEngine
    public int getHorsePower(){   // single responsibility principle, delegating responsibility of working out horsepower to garage.engine.IEngine
        return this.engine.getHorsePower();  // bus is only concerned with what the horsepower is so that it knows what engine it has
    }

    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
    }

//   ----- GETTERS & SETTERS -----
    public boolean getIsDoubleDecker() {
        return isDoubleDecker;
    }

    public void setDoubleDecker(boolean doubleDecker) {
        isDoubleDecker = doubleDecker;
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {  // used to change the engine
        this.engine = engine;
    }
}
