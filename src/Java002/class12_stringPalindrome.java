package Java002;

public class class12_stringPalindrome {
    public static void main(String[] args) {
        //Palindrome
        // Create a program that checks whether a given string is a palindrome.
        // A palindrome is a word or phrase that reads the same backward as forward
        // (ignoring spaces, punctuation, and capitalization).
        // Use an if-else statement to determine if the string is a palindrome.
        String name = "Madam";
        reverse rev = new reverse();

        if(name.equalsIgnoreCase(rev.reverse_String("Madam"))){
            System.out.println("it is a palindrome");
        }
        else {
            System.out.println("No palindrome");
        }

    }
}
class reverse{
    String reverse_String(String str_c){
        String str = str_c;
        StringBuilder sb = new StringBuilder();
        sb = sb.append(str);
        str= sb.reverse().toString();

        return str;
    }
}