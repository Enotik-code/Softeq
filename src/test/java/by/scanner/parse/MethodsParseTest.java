package by.scanner.parse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import by.scanner.strings.StringFile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MethodsParseTest {
    private final MethodsParse methods = new MethodsParse();

    private final String htmlCode = "<h1>Java<h1><h2>Java Python<h2>";
    private final String codeAfterRemovingTags = "JavaJava Python";
    private final String myWord = "Java";
    private final String countOfMyWord = "Result for Java - 2";

    private final List<String> strings = new ArrayList<>();

    @Test
    void getCountWordsOnHtmlTest() {
      assertEquals( countOfMyWord, methods.setCountWordsOnHtml(htmlCode,myWord));
    }

    @Test
    void removeDefaultTagsTest(){
        assertEquals(codeAfterRemovingTags, methods.removeTags(htmlCode, StringFile.REGEX_FOR_REMOVE_TAGS));
    }

}