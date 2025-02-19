package Java002;

public class class009_String {
    public static void main(String[] args) {
        //Palindrome
        stringbulidermethod s = new stringbulidermethod();
        s.firstmethod();
        secondmethodifelse sc = new secondmethodifelse();
        sc.secondmethod();


    }

    static class secondmethodifelse {
        void secondmethod() {
            String str = "Ritwik";
            String rev = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);}


                if (rev.equalsIgnoreCase(str)) {

                    System.out.println("it is a palindrome");
                }
                else
                    System.out.println("it is not a palindrome");

        }
    }

    static class stringbulidermethod {
        void firstmethod() {
            String s = "madam";
            StringBuilder sb = new StringBuilder(s);
            String s1 = sb.reverse().toString();
            if (s1.equalsIgnoreCase(s)) {
                System.out.println("it is a Palindrome");
            } else
                System.out.println("It is not a Palindrome");
        }
    }
}

