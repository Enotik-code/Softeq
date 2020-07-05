package by.scanner.parse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import by.scanner.parse.HtmlParse;
import org.junit.jupiter.api.Test;

class HtmlParseTest {
    private final HtmlParse htmlParse = new HtmlParse();
    private final String urlWithAccess = "https://tut.by/";
    private final String urlWithoutAccess = "https://metanit.com/";
    private final String doctypeHtml = "<!DOCTYPE html>";

    @Test
    void getHtmlCode() {
        assertEquals(true, htmlParse.getHtmlCode(urlWithAccess).startsWith(doctypeHtml));
    }

    @Test
    void getHtmlCodeFromNotAvailableSite()
    {
        assertEquals("", htmlParse.getHtmlCode(urlWithoutAccess));
    }
}