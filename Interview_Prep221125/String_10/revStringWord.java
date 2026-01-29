package String_10;

public class revStringWord {
    public static void main(String[] args) {
        System.out.println(revTheString("Ritwik"));
    }

    static String revTheString(String str) {
        str = str.trim();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            rev = rev + c;
        }
        return rev;
    }
}
