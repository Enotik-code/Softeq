package by.scanner;

import java.net.URL;
import java.util.Scanner;

public class TestHtmlParse {

    public static String getHtmlCode(String url) throws Exception {
        StringBuilder sb = new StringBuilder();
        for(Scanner sc = new Scanner(new URL(url).openStream()); sc.hasNext(); )
            sb.append(sc.nextLine()).append('\n');
        return sb.toString();
    }

}