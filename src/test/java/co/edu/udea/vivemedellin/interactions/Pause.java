package co.edu.udea.vivemedellin.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Pause implements Interaction {

    private final int milliseconds;

    private Pause(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    public static Pause forSeconds(int seconds) {
        return new Pause(seconds * 1000);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
