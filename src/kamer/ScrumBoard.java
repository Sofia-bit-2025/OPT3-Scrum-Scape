package kamer;

public class ScrumBoard implements Kamer {

    @Override
    public void betreed() {
        System.out.println("Je betreedt het Scrum Board.");
    }

    @Override
    public void actieUitvoeren() {
        System.out.println("Je update taken in To Do, Doing of Done.");
    }
}
