package StringsConcepts;

import java.util.HashMap;

public class DuplicateStringCharConcept {
    public static void main(String[] args) {
        DuplicateStringCharChecker dc = new DuplicateStringCharChecker("Learn Java");
    }
}
class DuplicateStringCharChecker{
    DuplicateStringCharChecker(String inputString){
        HashMap<Character, Integer>  charMap = new HashMap<>();
        char[] stringArr = inputString.toCharArray();
        for (char ch:stringArr){
            if (charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch)+1);
            }
            else {
                charMap.put(ch,1);
            }
        }
        System.out.println("InutString is : "+ inputString );
        for (char ch:charMap.keySet()){
            if (ch != ' '){
                System.out.println(ch +" = "+ charMap.get(ch));
            }
        }
    }
}
