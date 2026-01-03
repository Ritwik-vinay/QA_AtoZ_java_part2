package StringsConcepts;

public class anagramConcept {
    public static void main(String[] args) {
        anagramChecker gc = new anagramChecker();
        System.out.println( gc.anagramChecker("listen","silent"));
    }
}

class anagramChecker {
    boolean anagramChecker(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charCount = new int[256];
        for (int i = 0; i <= str1.length() - 1; i++) {
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }

        }
        return true;

    }
}
