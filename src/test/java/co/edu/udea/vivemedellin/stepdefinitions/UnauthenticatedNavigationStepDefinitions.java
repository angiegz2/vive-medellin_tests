package co.edu.udea.vivemedellin.stepdefinitions;

import co.edu.udea.vivemedellin.tasks.*;
import co.edu.udea.vivemedellin.ui.EventsListPage;
import co.edu.udea.vivemedellin.interactions.Pause;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;

import org.openqa.selenium.WebDriver;

public class UnauthenticatedNavigationStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver browser;

    private Actor visitor;

    @Before
    public void setUp() {
        visitor = Actor.named("Visitor");
        visitor.can(BrowseTheWeb.with(browser));
    }

    // --------------------------
    // Background
    // --------------------------

    @Given("the user is not authenticated")
    public void theUserIsNotAuthenticated() {
        visitor.attemptsTo(
                Pause.forSeconds(1)
        );
    }

    @Given("the user accesses the platform")
    public void theUserAccessesThePlatform() {
        visitor.attemptsTo(
                OpenApplication.onHomePage(),
                Pause.forSeconds(2)
        );
    }

    // --------------------------
    // Scenario: Access without authentication
    // --------------------------

    @When("the user views the initial list of events")
    public void theUserViewsTheInitialListOfEvents() {
        visitor.attemptsTo(
                Pause.forSeconds(1)
        );
    }

    @Then("the user should see the list of events without registering")
    public void theUserShouldSeeTheListOfEventsWithoutRegistering() {
        visitor.attemptsTo(
                Ensure.that(EventsListPage.SEARCH_INPUT).isDisplayed(),
                Pause.forSeconds(2)
        );
    }

    // --------------------------
    // Scenario: Search events by keyword
    // --------------------------

    @When("the user searches for events using the keyword {string}")
    public void theUserSearchesForEventsUsingTheKeyword(String keyword) {
        visitor.attemptsTo(
                SearchEventsByKeyword.with(keyword),
                Pause.forSeconds(2)
        );
    }

    @Then("the system should display the events that match the keyword {string}")
    public void theSystemShouldDisplayTheEventsThatMatchTheKeyword(String keyword) {
        visitor.attemptsTo(
                VerifyFilteredEvents.byKeyword(keyword),
                Pause.forSeconds(2)
        );
    }

    // --------------------------
    // Scenario: Apply basic filters
    // --------------------------

    @When("the user applies category, date, and location filters")
    public void theUserAppliesCategoryDateAndLocationFilters() {
        visitor.attemptsTo(
                ApplyBasicFilters.onTheList(),
                Pause.forSeconds(2)
        );
    }

    @Then("the system should update the event list showing only events that match the filters")
    public void theSystemShouldUpdateTheEventListShowingOnlyEventsThatMatchTheFilters() {
        visitor.attemptsTo(
                VerifyFilteredEvents.byBasicFilters(),
                Pause.forSeconds(2)
        );
    }

    // --------------------------
    // Scenario: View public event details
    // --------------------------

    @When("the user selects an event from the list")
    public void theUserSelectsAnEventFromTheList() {
        visitor.attemptsTo(
                ViewPublicEventDetails.fromTheList(),
                Pause.forSeconds(2)
        );
    }

    @Then("the user should access the public details including full description, images, and map")
    public void theUserShouldAccessThePublicDetailsIncludingFullDescriptionImagesAndMap() {
        visitor.attemptsTo(
                VerifyPublicEventDetails.completelyLoaded(),
                Pause.forSeconds(3)
        );
    }

    // --------------------------
    // @wip Scenario: Restriction of advanced features
    // --------------------------

    @When("the user tries to save, share, or register for an event without authentication")
    public void theUserTriesToSaveShareOrRegisterForAnEventWithoutAuthentication() {
        visitor.attemptsTo(
                TryAdvancedActions.withoutAuthentication(),
                Pause.forSeconds(2)
        );
    }

    @Then("the system should display a message inviting the user to register or sign in")
    public void theSystemShouldDisplayAMessageInvitingTheUserToRegisterOrSignIn() {
        visitor.attemptsTo(
                VerifyRestrictionMessage.invitingToRegister(),
                Pause.forSeconds(2)
        );
    }
}
