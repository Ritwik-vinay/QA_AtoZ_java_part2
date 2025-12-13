package StringsConcepts;

import java.util.HashMap;

public class DupeInString {
    public static void main(String[] args) {
        dupeStringChecker dupicate = new dupeStringChecker("Programming");

    }
}
class dupeStringChecker{
    dupeStringChecker(String inputString){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] chars= inputString.toCharArray();
        for (char c:chars){
            if (hashMap.containsKey(c)){
                hashMap.put(c, hashMap.get(c)+1);
            }else {hashMap.put(c,1);
            }
        }
        System.out.println("Duplicate Values are: ");
        for (char c: hashMap.keySet()){
            if (hashMap.get(c)>1){
                System.out.println(c + " = "+ hashMap.get(c));
            }
        }
    }
}
