package co.edu.udea.vivemedellin.tasks;

import co.edu.udea.vivemedellin.ui.EventsListPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ViewPublicEventDetails implements Task {

    public static ViewPublicEventDetails fromTheList() {
        return Tasks.instrumented(ViewPublicEventDetails.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EventsListPage.FIRST_EVENT_DETAILS_BUTTON)
        );
    }
}
