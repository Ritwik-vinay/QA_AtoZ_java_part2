package StringsConcepts;

public class removeSpacesFromStringConcept {
    public static void main(String[] args) {
        String stringWithoutSpaces= removeSpacesFromString("Welcome to java Automation");
        System.out.println(stringWithoutSpaces);
    }


    static String removeSpacesFromString(String str){
        StringBuilder result = new StringBuilder();
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)!= ' '){
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
