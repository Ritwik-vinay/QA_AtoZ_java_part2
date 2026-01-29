package String_10;

public class stringContainsDigits {
    public static void main(String[] args) {
        String input = "Automation123Testing";
        boolean containsDigit= false;
        for (char ch: input.toCharArray()){
            if (ch>='0' && ch<='9'){
                containsDigit=true;
                break;
            }
        }

        System.out.println(containsDigit);
    }
}
