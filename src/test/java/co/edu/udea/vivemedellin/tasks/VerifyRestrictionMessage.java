package co.edu.udea.vivemedellin.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

/**
 * Placeholder verification for a restriction message inviting
 * the user to log in or register when using advanced features.
 */
public class VerifyRestrictionMessage implements Task {

    public static VerifyRestrictionMessage invitingToRegister() {
        return Tasks.instrumented(VerifyRestrictionMessage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // This feature was not implemented in the final product
    }
}
