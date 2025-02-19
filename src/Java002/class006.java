package Java002;

public class class006 {
    public static void main(String[] args) {
        //Remove All White Spaces in a String
        String s = " My Aim is automation ";

        s = s.replaceAll("\\s", "");

        System.out.println("String without spaces: '" + s + "'");


    }
}
