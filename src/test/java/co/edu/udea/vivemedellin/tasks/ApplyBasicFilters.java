package co.edu.udea.vivemedellin.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ApplyBasicFilters implements Task {

    public static ApplyBasicFilters onTheList() {
        return Tasks.instrumented(ApplyBasicFilters.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Implement concrete clicks on filters when needed.
        // For the scope of HU011, the focus is on the navigation and visibility.
    }
}
