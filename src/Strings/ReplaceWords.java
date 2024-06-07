package Strings;

import java.util.Arrays;
import java.util.List;

public class ReplaceWords {
    public static void main(String[] args) {
        List<String> dictionary = List.of("cat", "bat", "rat");
        String sentence = "the cattle was rattled by the battery";
        System.out.println(replaceWords(dictionary, sentence));
    }
    public static String replaceWords(List<String> dictionary, String sentence) {
       //Split the array whee there are space to form an array
        String[] words = sentence.split(" ");

        for(int i = 0; i < words.length; i++){
            for(String root : dictionary){
                if(words[i].startsWith(root)){ //if the word starts with the root
                    words[i] = root; //replace the word with the root
                }
            }
        }
        return String.join(" ", words); //join the array with space
        //The time and space of this is O(n^2) where n is the number of words in the sentence
    }
}
