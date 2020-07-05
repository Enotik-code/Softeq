package by.scanner.parse.interfaces;

import java.util.ArrayList;
import java.util.List;

public interface ParseInterface {
    List<String> wordsList = new ArrayList<>();

    Integer setCountOfWords();
    void setWords(int countOfWords);
    String getWord(int numberInList);
    String setWebSite();
    String setCountWordsOnHtml(String webSiteHtml, String myWord);
    String removeTags(String htmlCode, String regex);
}
