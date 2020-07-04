package by.scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestHtmlParseTest {
    private final TestHtmlParse testHtmlParse = new TestHtmlParse();
    private final String urlWithAccess = "https://tut.by/";
    private final String urlWithoutAccess = "https://metanit.com/";
    private final String doctypeHtml = "<!DOCTYPE html>";

    @Test
    void getHtmlCode() {
        assertEquals(true, testHtmlParse.getHtmlCode(urlWithAccess).startsWith(doctypeHtml));
    }

    @Test
    void getHtmlCodeFromNotAvailableSite()
    {
        assertEquals("", testHtmlParse.getHtmlCode(urlWithoutAccess));
    }
}