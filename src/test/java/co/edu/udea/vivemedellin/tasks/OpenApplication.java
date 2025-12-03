package co.edu.udea.vivemedellin.tasks;

import co.edu.udea.vivemedellin.ui.EventsListPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenApplication implements Task {

    public static OpenApplication onHomePage() {
        return Tasks.instrumented(OpenApplication.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(EventsListPage.class)
        );
    }
}
