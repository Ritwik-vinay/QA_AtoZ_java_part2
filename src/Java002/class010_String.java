package Java002;

public class class010_String {
    public static void main(String[] args) {
        //Remove Leading Zeros
        String str = "0000102345";
        str=str.replaceFirst("0","");
        System.out.println("String without leading zeros: '" + str + "'");
        str= str.replace("0","");
        System.out.println("String without leading zeros: '" + str + "'");

    }
}
