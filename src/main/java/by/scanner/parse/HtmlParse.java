package by.scanner.parse;

import by.scanner.strings.StringFile;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class HtmlParse {

    static Logger log = Logger.getLogger(HtmlParse.class.getName());

    public String setHtmlCode(String url) {
            Document document = new Document(url);
        try {
            document = Jsoup.connect(url).get();
        } catch (IOException e) {
            log.error(StringFile.ERROR_TO_CONNECT_TO_WEBSITE_CHECK_URL_OR_ACCESS_TO_SITE);
        }
        return document.toString();
    }
}