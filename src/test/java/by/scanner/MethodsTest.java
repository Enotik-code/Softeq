package by.scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Optional;

class MethodsTest {
    Methods methods = new Methods();

    @Test
    void getCountOfWords() {
        assertEquals(2, Optional.ofNullable(methods.getCountOfWords()));
    }

    @Test
    void getWords() {
        assertEquals("word", Optional.ofNullable(methods.getWords()));
    }

    @Test
    void getWebSite() {
        assertEquals("site", Optional.ofNullable(methods.getWebSite()));
    }

    @Test
    void getCountWordsOnHtml() {
    }

}