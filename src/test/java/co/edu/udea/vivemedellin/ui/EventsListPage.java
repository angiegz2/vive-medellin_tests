package co.edu.udea.vivemedellin.ui;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


@DefaultUrl("/")   
public class EventsListPage extends PageObject {

    // =========================
    // EVENTS LIST
    // =========================

    public static final Target EVENTS_GRID =
            Target.the("events grid")
                    .locatedBy("div.grid.gap-6");

    public static final Target EVENTS_HEADING =
            Target.the("events section heading")
                    .locatedBy("//h2[contains(.,'Eventos')]");


    public static final Target EVENT_CARDS =
            Target.the("event cards")
                    .locatedBy("div.bg-white.rounded-lg.shadow-md");

    public static final Target FIRST_EVENT_CARD =
            Target.the("first event card")
                    .locatedBy("(//div[contains(@class,'bg-white') and contains(@class,'rounded-lg') and contains(@class,'shadow-md')])[1]");


    public static final Target FIRST_EVENT_DETAILS_BUTTON =
            Target.the("first event details button")
                    .locatedBy("(//div[contains(@class,'bg-white') and contains(@class,'rounded-lg') and contains(@class,'shadow-md')]//a[contains(@href,'/eventos/')])[1]");


    public static final Target EMPTY_STATE_TITLE =
            Target.the("empty events message title")
                    .locatedBy("div.text-center.py-12 h3.font-h-3");

    // =========================
    // SEARCH FORM 
    // =========================

    public static final Target SEARCH_INPUT =
            Target.the("events search input")
                    .locatedBy("#busqueda");

    public static final Target SEARCH_BUTTON =
            Target.the("events search button")
                    .locatedBy("//input[@id='busqueda']/ancestor::form//button[@type='submit']");
 
    public static final Target SEARCH_RESULTS_HEADING =
            Target.the("search results heading")
                    .locatedBy("//h2[contains(.,'Resultados de Búsqueda')]");
}
