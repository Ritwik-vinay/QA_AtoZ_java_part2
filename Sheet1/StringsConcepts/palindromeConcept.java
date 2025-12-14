package StringsConcepts;

public class palindromeConcept {
    public static void main(String[] args) {
        System.out.println(palindromeChecker("madaMa"));
    }


    static boolean palindromeChecker(String str){
        str= str.toLowerCase();
        char ch = 0;
        String rev="";
        boolean b= false;
        for (int i= str.length()-1;i>=0;i--){
            ch=  str.charAt(i);
            rev= rev+ ch;
        }
        if (str.equalsIgnoreCase(rev)){
            b=true;
//            System.out.println(b);
        }

        return b;
    }
}
