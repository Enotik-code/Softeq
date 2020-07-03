package by.scanner;

import static by.scanner.TestHtmlParse.getHtmlCode;

public class Application {
    public static void main(String[] args) throws Exception {
        Methods methods = new Methods();
        methods.getCountWords(getHtmlCode(methods.getWebSite()), methods.getWords());
    }
}
