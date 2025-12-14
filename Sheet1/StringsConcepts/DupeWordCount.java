package StringsConcepts;

import java.util.HashMap;

public class DupeWordCount {
    public static void main(String[] args) {
        DupeWordCountChecker wordCount = new DupeWordCountChecker("Java Selenium programming selenium Automation Selenium");
    }
}
class DupeWordCountChecker{
    DupeWordCountChecker(String input){
        String[] words = input.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String str: words){
            str= str.toLowerCase();
            if (map.containsKey(str)){
                map.put(str, map.get(str)+1);
            }
            else{
                map.put(str,1);
            }
        }
        for (String str: map.keySet()){
            if (!str.equals(" ")){
                System.out.println(str + " = "+ map.get(str));
            }
        }
    }

}