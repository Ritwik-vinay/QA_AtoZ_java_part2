package collections;

import java.util.HashMap;

public class HashMapQuestions {
    public static void main(String[] args) {
        String input= "java is java and java is easy";
        wordOccurance wo = new wordOccurance();
        wo.wordOccuranceCount(input);
    }

}
 class wordOccurance{
    void wordOccuranceCount(String inputSentence){
        String[] words= inputSentence.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word: words){
            if (map.containsKey(word)){
                map.put(word, map.get(word)+1);

            }else {
                map.put(word,1);
            }

            }
        for (String w: map.keySet()){
            if (map.get(w)>=1){
                System.out.println(w + " = "+ map.get(w));
            }
        }

    }
 }
