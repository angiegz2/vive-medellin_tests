package co.edu.udea.vivemedellin.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class EnterText implements Interaction {

    private final Target target;
    private final String value;

    private EnterText(Target target, String value) {
        this.target = target;
        this.value = value;
    }

    public static EnterText into(Target target, String value) {
        return Tasks.instrumented(EnterText.class, target, value);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(value).into(target)
        );
    }
}
