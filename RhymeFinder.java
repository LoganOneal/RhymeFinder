import java.util.ArrayList;

public class RhymeFinder{


    RhymeFinder() {
    }    

    public ArrayList<String> parseWords(String text) {
        ArrayList<String> words = new ArrayList<String>();
        String word = "";

        for(int i = 0; i<text.length(); i++) {
            String thisChar = text.substring(i, i+1);
            if (thisChar.equals(" ")){
                words.add(word);
                word = "";
            } else if (i == text.length()-1){
                word += text.substring(i);
                words.add(word);
            } else {
                word += thisChar;
            }
        }

        return words;
    }
    public ArrayList<String> findRhymes(ArrayList<String> words) {
        ArrayList<String> rhymes  = new ArrayList<String>();
        String[] vowels = {"a","e","i","o","u"};

        for( String word : words) {
                int lastVowel=0;
                for (String vowel : vowels) {
                    if( (word.indexOf(vowel) > 0) && (word.indexOf(vowel) > lastVowel)){
                        lastVowel = word.indexOf(vowel);
                    }
                }

                String lastSylabel = word.substring(lastVowel);
                for(String compareWord : words) {
                    if( (word.equals(compareWord) != true) && lastVowel != word.length()-1) {
                        if (compareWord.indexOf(lastSylabel) > 0) {
                            rhymes.add(word + " " + compareWord);
                        }
                    }
                }

        }

        return rhymes;
    }

}