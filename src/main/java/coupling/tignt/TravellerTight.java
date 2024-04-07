package coupling.tignt;
/*
It is a tightly couple application
Whenevr we called startJourney method of Traveller class then move method of car is called
Which is nota right approch.Tightl coupling is treated as design anti-pattern
We can overcome it by using abstract class or interface
 */
public class TravellerTight {
    Car car;
    TravellerTight(){
        car=new Car();
    }
    public void startJourney(){
        this.car.move();
    }
}
