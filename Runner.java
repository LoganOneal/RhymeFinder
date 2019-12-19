import java.util.ArrayList;


public class Runner{

    public static void main(String[] args) {

        String text = "cat hat rat tall wow amazing tazing";
        
        RhymeFinder finder = new RhymeFinder();

        ArrayList<String> wordList = finder.parseWords(text);
        ArrayList<String> rhymes = finder.findRhymes(wordList);

        System.out.println(rhymes);


    }
}