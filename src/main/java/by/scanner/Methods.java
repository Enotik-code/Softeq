package by.scanner;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Methods {

    public static Scanner scInteger = new Scanner(System.in);
    public static Scanner scString = new Scanner(System.in);

    public Integer getCountOfWords(){
        int number;
        do {
            System.out.println("Please enter a count of words!");
            while (!scInteger.hasNextInt()) {
                System.out.println("That not a number!");
                scInteger.next();
            }
            number = scInteger.nextInt();
        } while (number <= 0);
        return number;
    }

    public String getWords(){
            System.out.println("Please enter u word");
            return scString.nextLine();
    }

    public String getWebSite(){
        System.out.println("Enter website");
        return scString.nextLine();
    }

    public void getCountWordsOnHtml(String webSiteHtml, String myWord) {
        removeTags(webSiteHtml);
        Pattern pattern = Pattern.compile(myWord, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(webSiteHtml);
        HashMap<String, Integer> wordToCount = new HashMap<>();
        while(matcher.find()){
            if(!wordToCount.containsKey(myWord)){
                wordToCount.put(myWord, 0);
            }
            wordToCount.put(myWord, wordToCount.get(myWord) + 1);
        }
        for (String word : wordToCount.keySet() ) {
            System.out.println(word + " " + wordToCount.get(word));
        }
    }



    public void removeTags(String text){
        Pattern pattern = Pattern.compile("<([\\s\\S]+?>)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            matcher.replaceAll("");
        }
    }
}
