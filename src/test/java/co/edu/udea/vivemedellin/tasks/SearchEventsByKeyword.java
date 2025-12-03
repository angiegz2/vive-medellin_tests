package co.edu.udea.vivemedellin.tasks;

import co.edu.udea.vivemedellin.ui.EventsListPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchEventsByKeyword implements Task {

    private final String keyword;

    public SearchEventsByKeyword(String keyword) {
        this.keyword = keyword;
    }

    public static SearchEventsByKeyword with(String keyword) {
        return instrumented(SearchEventsByKeyword.class, keyword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(keyword).into(EventsListPage.SEARCH_INPUT),
                Click.on(EventsListPage.SEARCH_BUTTON)
        );
    }
}
