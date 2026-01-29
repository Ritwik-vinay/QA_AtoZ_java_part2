package String_10;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class DupeChar {
    public static void main(String[] args) {
        dupeCharValuesInWord("Automation");

    }

    static void dupeCharValuesInWord(String in){
        in = in.toLowerCase().trim();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: in.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch,(map.get(ch))+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        for (char c: map.keySet()){
            if (c>1){
                System.out.println(c + " = "+ map.get(c));
            }
        }
    }
}