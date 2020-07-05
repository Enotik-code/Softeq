package by.scanner;

import by.scanner.parse.MethodsParse;
import by.scanner.parse.HtmlParse;
import org.apache.log4j.Logger;

import static by.scanner.parse.MethodsParse.wordsList;

public class Application {
    static Logger log = Logger.getLogger(Application.class.getName());

    public static void main(String[] args){
        MethodsParse methods = new MethodsParse();
        HtmlParse htmlParse = new HtmlParse();

        String webSite = methods.getWebSite();
        Integer countOfWords = methods.getCountOfWords();
        methods.getWords(countOfWords);

        for (int i = 0; i < countOfWords ; i++) {
            log.info(methods.getCountWordsOnHtml(htmlParse.getHtmlCode(webSite), wordsList.get(i)));
        }
    }

}
