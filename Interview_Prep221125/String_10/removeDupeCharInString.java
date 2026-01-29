package String_10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class removeDupeCharInString {
    public static void main(String[] args) {
        String input= "SoftwareAutomation";
        Map<Character, Integer> charmap = new LinkedHashMap<>();
        input= input.toLowerCase();
        for (char ch: input.toCharArray()){
            if (charmap.containsKey(ch)){
                charmap.put(ch, (charmap.get(ch))+1);
            }
            else {
                charmap.put(ch, 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c: charmap.keySet()){
            if (charmap.get(c)==1){
                sb.append(c);
            }
        }
        System.out.println("After removing the duplicate characters: " + sb.toString());
    }
}
