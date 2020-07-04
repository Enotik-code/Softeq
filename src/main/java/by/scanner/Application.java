package by.scanner;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws Exception {
        Methods methods = new Methods();
        TestHtmlParse testHtmlParse = new TestHtmlParse();
        Integer countOfWord = methods.getCountOfWords();
        String webSite = methods.getWebSite();

        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < countOfWord ; i++) {
           stringList.add(methods.getWords());
        }
        for (int i = 0; i < countOfWord ; i++) {
            methods.getCountWordsOnHtml(testHtmlParse.getHtmlCode(webSite), stringList.get(i));
        }
    }

}
