package co.edu.udea.vivemedellin.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickOn implements Interaction {

    private final Target target;

    private ClickOn(Target target) {
        this.target = target;
    }

    public static ClickOn element(Target target) {
        return Tasks.instrumented(ClickOn.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(target)
        );
    }
}

