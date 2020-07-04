package by.scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Optional;

class MethodsTest {
    private final Methods methods = new Methods();

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