package by.scanner.parse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HtmlParseTest {
    private final HtmlParse htmlParse = new HtmlParse();

    private final String urlWithAccess = "https://tut.by/";
    private final String urlWithoutAccess = "https://tut.bu.com/";
    private final String doctypeHtml = "<!doctype html>";

    @Test
    void setHtmlCode() {
        assertEquals(true, htmlParse.setHtmlCode(urlWithAccess).startsWith(doctypeHtml));
    }

    @Test
    void setHtmlCodeFromNotAvailableSite()
    {
        assertEquals("", htmlParse.setHtmlCode(urlWithoutAccess));
    }
}