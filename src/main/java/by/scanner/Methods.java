package by.scanner;

import java.util.*;

public class Methods {

    public static Scanner scInteger = new Scanner(System.in);
    public static Scanner scString = new Scanner(System.in);
    public static List<String> stringList = new ArrayList<String>();

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


    public Integer countWords(String input, String word)
    {
        return (int) Arrays.stream(input.split("")).filter(s -> s.contains(word)).count();
    }

    public void getCountWords(String webSiteHtml, String myWord) {
        String[] words = webSiteHtml.split("\\s+");
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words) {
            if (word.equals(myWord)) {
                if (!wordToCount.containsKey(word)) {
                    wordToCount.put(word, 0);
                }
                wordToCount.put(word, wordToCount.get(word) + 1);
            }
        }
        for (String word : wordToCount.keySet() ) {
            System.out.println(word + " " + wordToCount.get(word));
        }
    }

}
