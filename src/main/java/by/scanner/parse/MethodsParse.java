package by.scanner.parse;

import by.scanner.parse.interfaces.ParseInterface;
import by.scanner.strings.StringFile;
import org.apache.log4j.Logger;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodsParse implements ParseInterface {
    public static final Scanner scInteger = new Scanner(System.in);
    public static final Scanner scString = new Scanner(System.in);

    static Logger log = Logger.getLogger(MethodsParse.class.getName());

    protected static final List<String> wordsList = new ArrayList<>();

    public Integer setCountOfWords(){
        int number;
        do {
            log.info(StringFile.EnterCountOfWords);
            while (!scInteger.hasNextInt()) {
                log.error(StringFile.ErrorToGetNumberOfWords);
                scInteger.next();
            }
            number = scInteger.nextInt();
        } while (number <= 0);
        return number;
    }

    public void setWords(int countOfWords){
        for (int i = 0; i < countOfWords; i++) {
            log.info(StringFile.EnterYourWord);
            wordsList.add(scString.nextLine());
        }
    }

    public String getWord(int numberInList){
        return wordsList.get(numberInList);
    }

    public String setWebSite(){
        log.info(StringFile.EnterWebSite);
        return scString.nextLine();
    }

    public String setCountWordsOnHtml(String webSiteHtml, String myWord) {
        Pattern pattern = Pattern.compile(myWord, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(removeTags(removeTags(webSiteHtml, StringFile.RegexForRemoveJavaScriptCode),
                StringFile.RegexForRemoveTags));
        HashMap<String, Integer> wordToCount = new HashMap<>();
        while(matcher.find()){
            if(!wordToCount.containsKey(myWord)){
                wordToCount.put(myWord, 0);
            }
            wordToCount.put(myWord, wordToCount.get(myWord) + 1);
        }
         return StringFile.Result + myWord + " - " + wordToCount.get(myWord);
    }

    public String removeTags(String htmlCode, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(htmlCode);
        return  matcher.replaceAll("");
    }
}
