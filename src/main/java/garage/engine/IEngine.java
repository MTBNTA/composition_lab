package garage.engine;

public interface IEngine {

    // we state that if something has an engine it must have a horsepower as well
    int getHorsePower();
    void setHorsePower(int horsePower);

}
