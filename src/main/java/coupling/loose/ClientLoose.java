package coupling.loose;
/*
Here we can pass value dynamically so we don't need to change source code again and agian.
Tight coupling is called design antiparttern
 */
public class ClientLoose {
    public static void main(String[] args) {
        Vehicle bike=new Bike();
        Vehicle auto= new Auto();
        TravellerLoose travellerLoose=new TravellerLoose(bike);
        TravellerLoose travellerLoose2=new TravellerLoose(auto);
        travellerLoose.startJourney();
    }
}
