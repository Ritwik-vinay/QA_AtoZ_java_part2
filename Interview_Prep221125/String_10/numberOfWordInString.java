package String_10;

public class numberOfWordInString {
    public static void main(String[] args) {
        String word= "Testing Automation";
        int count =0;
        for (int i=0; i<word.length();i++){
            char ch= word.charAt(i);
            if (ch>='a' && ch<= 'z' || ch>= 'A' && ch<= 'Z'){
                count++;
            }
        }
        System.out.println(count);
    }
}
