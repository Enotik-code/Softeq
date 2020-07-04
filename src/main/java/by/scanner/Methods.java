package by.scanner;

import org.apache.log4j.Logger;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.scanner.TestHtmlParse.log;

public class Methods {

    public static Scanner scInteger = new Scanner(System.in);
    public static Scanner scString = new Scanner(System.in);
    static Logger log = Logger.getLogger(Methods.class.getName());

    public Integer getCountOfWords(){
        int number;
        do {
            log.info("Please enter a count of words!");
            while (!scInteger.hasNextInt()) {
                log.error("That not a number!");
                scInteger.next();
            }
            number = scInteger.nextInt();
        } while (number <= 0);
        return number;
    }

    public String getWords(){
            log.info("Please enter u word");
            return scString.nextLine();
    }

    public String getWebSite(){
        log.info("Enter website");
        return scString.nextLine();
    }

    public void getCountWordsOnHtml(String webSiteHtml, String myWord) {
        Pattern pattern = Pattern.compile(myWord, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(removeTags(webSiteHtml));
        HashMap<String, Integer> wordToCount = new HashMap<>();
        while(matcher.find()){
            if(!wordToCount.containsKey(myWord)){
                wordToCount.put(myWord, 0);
            }
            wordToCount.put(myWord, wordToCount.get(myWord) + 1);
        }
        for (String word : wordToCount.keySet() ) {
            System.out.println("result for " + word + " - " + wordToCount.get(word));
        }
    }



    public String removeTags(String htmlCode){
        Pattern pattern = Pattern.compile("<([\\s\\S]+?)>");
        Matcher matcher = pattern.matcher(htmlCode);
        while (matcher.find()){
            matcher.replaceAll("");
        }
        return htmlCode;
    }
}
