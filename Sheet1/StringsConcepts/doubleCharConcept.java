package StringsConcepts;

public class doubleCharConcept {
    public static void main(String[] args) {
        String doubledString = doubleCharConcept("JAVA");
        System.out.println(doubledString);
    }

    static String doubleCharConcept(String str){
        StringBuilder doubled = new StringBuilder();
        for (int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            doubled.append(ch).append(ch);
        }
        return doubled.toString();
    }
}
