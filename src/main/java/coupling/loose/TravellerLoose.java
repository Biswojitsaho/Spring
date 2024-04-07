package coupling.loose;
/*
Here we can pass value dynamically in constructor and we can call which method we want so we
don't need to update the source code again and again
 */
public class TravellerLoose {
    Vehicle vehicle;
    TravellerLoose(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    public void startJourney(){
        this.vehicle.move();
    }
}
