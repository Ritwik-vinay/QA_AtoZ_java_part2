package arraysConcepts;

import java.util.HashMap;

public class OccuranceOftheWord {
    public static void main(String[] args) {
        String input= "testing";
        occuranceOfWord(input);

    }

    static void occuranceOfWord(String input){
        char[] ch = input.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: ch){
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
            }
        for (char s: map.keySet()){
            if (map.get(s)>=1){
                System.out.println(s +"  = "+ map.get(s));
            }
        }

        }


    }

