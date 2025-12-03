package co.edu.udea.vivemedellin.tasks;

import co.edu.udea.vivemedellin.ui.EventsListPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

public class VerifyFilteredEvents {

    private VerifyFilteredEvents() {
        // Utility class – no instances
    }

    public static Performable byKeyword(String keyword) {
        return Task.where(
                "{0} verifies that the search input keeps the keyword '" + keyword + "'",
                // Assert that the input's value contains the keyword typed by the user
                Ensure.that(EventsListPage.SEARCH_INPUT)
                        .attribute("value")
                        .contains(keyword)
        );
    }

    public static Performable byBasicFilters() {
        return Task.where(
                "{0} verifies that the events search input is visible after applying basic filters",
                Ensure.that(EventsListPage.SEARCH_INPUT).isDisplayed()
        );
    }
}
