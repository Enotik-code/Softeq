package by.scanner.parse.interfaces;

public interface ParseInterface {
    Integer getCountOfWords();
    void getWords(int countOfWords);
    String getWebSite();
    String getCountWordsOnHtml(String webSiteHtml, String myWord);
    String removeTags(String htmlCode, String regex);
}
