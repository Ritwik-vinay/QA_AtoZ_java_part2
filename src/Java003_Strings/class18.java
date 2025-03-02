package Java003_Strings;

public class class18 {
    public static void main(String[] args) {
        String name ="hello";
        String rev="";
        for (int i=name.length()-1;i>=0;i--){
             rev =rev+ name.charAt(i);

        }

        System.out.println("Original is "+name);
        System.out.println("rev is " +rev);
    }
}
