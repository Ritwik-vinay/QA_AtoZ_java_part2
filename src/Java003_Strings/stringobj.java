package Java003_Strings;

public class stringobj {
    public static void main(String[] args) {
        String str = new String();
        example ex= new example();
        ex.greet();
        System.out.println( 12 +15 +" i am "  + " number ");
        String str1 = "My Name";
        String[] a =str1.split(" ");
        //for each loop
        for (String b: a){
            System.out.println(b);
        }


    }
}
class example{
    void greet(){
        System.out.println("Good Morning");
    }
}
