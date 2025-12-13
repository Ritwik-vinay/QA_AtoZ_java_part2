package StringsConcepts;

public class reverseTheWordConcept {
    public static void main(String[] args) {
        reversetheWordChecker rv = new reversetheWordChecker("Java Programming");
    }
}

class reversetheWordChecker {
    reversetheWordChecker(String str) {
        String rev = "";
        String[] st = str.split(" ");
        for (int i = 0; i <= st.length - 1; i++) {
            String word = st[i];
            String nstr = "";
            char ch;
            for (int j = 0; j <= word.length() - 1; j++) {
                ch = word.charAt(j);
                nstr = ch + nstr;
            }
            rev = rev + nstr + " ";
        }
        System.out.println(rev + " ");

    }
}
