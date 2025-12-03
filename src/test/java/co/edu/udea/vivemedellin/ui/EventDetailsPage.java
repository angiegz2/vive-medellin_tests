// src/test/java/co/edu/udea/vivemedellin/ui/EventDetailsPage.java
package co.edu.udea.vivemedellin.ui;

import org.openqa.selenium.By;

public class EventDetailsPage {

    public static final By DETAILS_CONTAINER =
            By.cssSelector("div.max-w-4xl.mx-auto");

    public static final By EVENT_TITLE =
            By.cssSelector("h1.font-h-1");

    public static final By EVENT_DESCRIPTION_PARAGRAPHS =
            By.cssSelector("div.font-p.text-gray-700.prose.prose-lg p");

    public static final By EVENT_PRICE =
            By.cssSelector("div.text-center.mb-6.p-4.bg-blue-50.rounded-lg p.font-h-2");

    public static final By EVENT_DATE_TEXT =
            By.xpath("//p[contains(.,'Fecha y Hora')]/following-sibling::p[1]");

    public static final By EVENT_TIME_TEXT =
            By.xpath("//p[contains(.,'Fecha y Hora')]/following-sibling::p[2]");

    public static final By EVENT_LOCATION_BLOCK =
            By.xpath("//p[contains(.,'Ubicación')]/ancestor::div[1]");

    public static final By EVENT_MAP_LINK =
            By.xpath("//a[contains(.,'Ver en el mapa')]");

    public static final By ORGANIZER_NAME =
            By.xpath("//p[contains(.,'Organizador')]/following-sibling::p[1]");

    public static final By ORGANIZER_EMAIL_LINK =
            By.xpath("//p[contains(.,'Organizador')]/following-sibling::a[1]");

    public static final By CANCELLED_BADGE =
            By.xpath("//div[contains(.,'Evento Cancelado') and contains(@class,'bg-gray-100')]");
}
