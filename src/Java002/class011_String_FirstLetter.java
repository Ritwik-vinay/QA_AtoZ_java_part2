package Java002;

public class class011_String_FirstLetter {
    public static void main(String[] args) {
        String str = "Last agent standing towards";
        StringBuilder firstLetters = new StringBuilder();
        for (String word : str.split("\\s+")) {
            firstLetters.append(word.charAt(0));
        }
        System.out.println("FirstLetter is " + firstLetters.toString());
    }

}
