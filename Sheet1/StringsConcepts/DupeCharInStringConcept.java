package StringsConcepts;

import java.util.HashMap;

public class DupeCharInStringConcept {
    public static void main(String[] args) {
        DupeCharInString dc = new DupeCharInString("Java Programming");
    }
}
class DupeCharInString{
    DupeCharInString(String input){
        HashMap<Character,Integer> map = new HashMap<>();
        char[] charArr = input.toCharArray();
        for (char ch : charArr){
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for (char c: map.keySet()){
            if (c!=' '){
                System.out.println(c + " = "+ map.get(c));

            }
        }
    }
}
