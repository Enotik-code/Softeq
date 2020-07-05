package by.scanner.parse.interfaces;

public interface ParseInterface {
    Integer setCountOfWords();
    void setWords(int countOfWords);
    String getWord(int numberInList);
    String setWebSite();
    String setCountWordsOnHtml(String webSiteHtml, String myWord);
    String removeTags(String htmlCode, String regex);
}
