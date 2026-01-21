package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class nonRepeatingCharacter {
    public static void main(String[] args) {
        nonRepeatCharacter character = new nonRepeatCharacter();
        character.nonRepeatCharacter("swwiss");
    }
}
class nonRepeatCharacter {
    void nonRepeatCharacter(String input) {
        input = input.toLowerCase();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap();
        for (char ch : input.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-Repeating character : " + entry.getKey());
                return;
            }
        }
        System.out.println("No non-repeating character found");
    }
}