package by.scanner;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class TestHtmlParse {

    static Logger log = Logger.getLogger(TestHtmlParse.class.getName());

    public String getHtmlCode(String url){
        StringBuilder sb = new StringBuilder();
        try {
            for(Scanner sc = new Scanner(new URL(url).openStream()); sc.hasNext(); )
                sb.append(sc.nextLine()).append('\n');
        } catch (IOException e) {
            log.error("Error to connect to website. Check url or access to site");
        }
        return sb.toString();
    }

}