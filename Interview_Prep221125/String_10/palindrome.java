package String_10;

public class palindrome {
    public static void main(String[] args) {
        String org= "digit";
        revStringWord revString = new revStringWord();
        String revWord= revString.revTheString(org);
        if (revWord.equals(org)){
            System.out.println("It is a Palindrome "+ "'"+org+"'");
        }
        else {
            System.out.println("It is not a Palindrome "+ "'"+org+"'");
        }

    }
}
