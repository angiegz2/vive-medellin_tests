package co.edu.udea.vivemedellin.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VerifyPublicEventDetails implements Task {

    private static final Target EVENT_DETAILS_CONTAINER =
            Target.the("event details container")
                    .located(By.cssSelector("div.max-w-4xl.mx-auto"));

    public static VerifyPublicEventDetails completelyLoaded() {
        return Tasks.instrumented(VerifyPublicEventDetails.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(EVENT_DETAILS_CONTAINER).isDisplayed()
        );
    }
}
