import garage.land.Car;
import garage.engine.CombustionEngine;
import garage.engine.ElectricEngine;
import garage.engine.IEngine;
import garage.water.Speedboat;

public class Runner {  // to test the classes, not a mode of transportation

    public static void main(String[] args) { // we don't have tests at the moment, so we use 'sout' to check it
        IEngine combustionEngine = new CombustionEngine(99, "01/01/2014"); // makes line 5 neater
        Car hondaJazz = new Car(1300, 150, "hatchback", combustionEngine);
        System.out.println(hondaJazz.getHorsePower());

        IEngine electricEngine = new ElectricEngine(399, 100);
        hondaJazz.setEngine(electricEngine);  // seeing if different engine type has been swapped in, used horsepower to test engine types
        System.out.println(hondaJazz.getHorsePower());


        IEngine electricEngine1 = new ElectricEngine(70,85);
        Speedboat dash = new Speedboat(50,100,true,"displacement",electricEngine1);
        System.out.println(dash.getHorsePower());

        IEngine combustionEngine1 = new CombustionEngine(130,"25/12/2023");
        dash.setEngine(combustionEngine1);
        System.out.println(dash.getHorsePower());
    }

}
