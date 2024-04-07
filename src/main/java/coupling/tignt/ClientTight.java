package coupling.tignt;

public class ClientTight {
    public static void main(String[] args) {
        TravellerTight traveller=new TravellerTight();
        traveller.startJourney();
// every time car class move method will execute.We can call Bus class move method but by updating source code.
    }
}
