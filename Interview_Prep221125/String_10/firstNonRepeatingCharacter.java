package String_10;

public class firstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "SoftwareTesting";
        firstNonRepeatingCharacter charNonRepeating = new firstNonRepeatingCharacter();
        System.out.println(charNonRepeating.firstNonRepeatingChar("SoftwareTesting"));

    }
    char firstNonRepeatingChar(String input){
        int[] freq = new int[256];
        for (char ch : input.toCharArray()){
            freq[ch]++;
        }

        for (char ch : input.toCharArray()){
            if (freq[ch]== 1){
                return ch;

            }
        }
        return 0;
    }
}
