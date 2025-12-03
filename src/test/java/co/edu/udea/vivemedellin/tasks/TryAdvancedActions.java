package co.edu.udea.vivemedellin.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class TryAdvancedActions implements Task {

    public static TryAdvancedActions withoutAuthentication() {
        return Tasks.instrumented(TryAdvancedActions.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // This feature was not implemented in the final product
    }
}
