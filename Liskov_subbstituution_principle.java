/* If a class A is a subtype of class B, then objects of class A can be substituted for objects of class B without affecting the correctness of the program 
 * Subclass should extend the capabilities of super class, not naroow it down
*/

interface Bike{
    void turnOnEngine();
    void accelarate();
}

class MotorCycle implements Bike{
    boolean isEngineOn;
    int tires;

    public void turnOnEngine(){
        isEngineOn = true;
    }

    public void accelarate(){
        // do something
    }
}

class cycle implements Bike{


    public void turnOnEngine(){
        throw new AssertionError("there is no engine") // breaks
    }

    public void accelarate(){
        speed += 10;
    }
}

// how to avoid this?
public class Vehicle{
    public Integer wheels(){
        return 2;
    }
}

public class BiCycle extends Vehicle{

}

public class EngineVehicles extends Vehicle{
    public boolean hasEngine() {
        return True;
    }
}

public class car extends EngineVehicles{

}

public class MotorCycle extends EngineVehicles{
    
}