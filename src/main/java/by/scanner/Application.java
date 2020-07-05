package by.scanner;

import by.scanner.parse.MethodsParse;
import by.scanner.parse.HtmlParse;
import org.apache.log4j.Logger;


public class Application{
    static Logger log = Logger.getLogger(Application.class.getName());

    public static void main(String[] args){
        MethodsParse methods = new MethodsParse();
        HtmlParse htmlParse = new HtmlParse();

        String webSite = methods.setWebSite();
        Integer countOfWords = methods.setCountOfWords();
        methods.setWords(countOfWords);

        for (int i = 0; i < countOfWords ; i++) {
            log.info(methods.setCountWordsOnHtml(htmlParse.setHtmlCode(webSite), methods.getWord(i)));
        }
    }

}
