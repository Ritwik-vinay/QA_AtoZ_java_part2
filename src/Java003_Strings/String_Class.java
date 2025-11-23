package Java003_Strings;

import java.util.Locale;

public class String_Class {

    //'S' 'T' 'R' 'I' 'N' 'G' -> Charcters
    //"Strings" -> Class
    public static void main(String[] args) {
        //SCP -> String Constant Pool {a-> Hello b-> World -> Concat -> Hello World}
        String  a = " GEET ";
        a="GEET ";
       // System.out.println(a.length());
      //  a= a.trim();
     //   System.out.println(a.length());
        String b = "ritwik";
        b= b.toUpperCase();
        System.out.println(b.charAt(5));
        System.out.println(b.toLowerCase());
        if (a.equalsIgnoreCase(b)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


    }
}
