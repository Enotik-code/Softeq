package by.scanner;

import static by.scanner.Methods.wordsList;

public class Application {
    public static void main(String[] args) throws Exception {
        Methods methods = new Methods();
        TestHtmlParse testHtmlParse = new TestHtmlParse();

        String webSite = methods.getWebSite();
        Integer countOfWords = methods.getCountOfWords();
        methods.getWords(countOfWords);

        for (int i = 0; i < countOfWords ; i++) {
            System.out.println(methods.getCountWordsOnHtml(testHtmlParse.getHtmlCode(webSite), wordsList.get(i)));
        }
    }

}
