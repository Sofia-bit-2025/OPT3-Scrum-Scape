package kamer;

public class SprintPlanning implements Kamer {

    @Override
    public void betreed() {
        System.out.println("Je bent in de Sprint Planning kamer.");
    }

    @Override
    public void actieUitvoeren() {
        System.out.println("Je stelt samen met het team de Sprint Backlog op.");
    }
}