package by.scanner.parse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import by.scanner.parse.MethodsParse;
import by.scanner.strings.StringFile;
import org.junit.jupiter.api.Test;

class MethodsParseTest {
    private final MethodsParse methods = new MethodsParse();

    private final String htmlCode = "<h1>Java<h1><h2>Java Python<h2>";
    private final String codeAfterRemovingTags = "JavaJava Python";
    private final String myWord = "Java";
    private final String countOfMyWord = "Result for Java - 2";

    @Test
    void getCountWordsOnHtmlTest() {
      assertEquals( countOfMyWord, methods.getCountWordsOnHtml(htmlCode,myWord));
    }

    @Test
    void removeDefaultTagsTest(){
        assertEquals(codeAfterRemovingTags, methods.removeTags(htmlCode, StringFile.RegexForRemoveTags));
    }

}