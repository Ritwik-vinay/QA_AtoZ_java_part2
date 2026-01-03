package StringsConcepts;

public class countTheAlphabet {
    public static void main(String[] args) {
        System.out.println(countAlphabetChecker("aabbcccdd"));
    }

    static String countAlphabetChecker(String input) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                sb.append(input.charAt(i)).append(count);
                count = 1;
            }
        }
        return sb.toString();
    }
}
