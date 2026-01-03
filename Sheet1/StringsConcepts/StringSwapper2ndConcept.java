package StringsConcepts;

public class StringSwapper2ndConcept {
    public static void main(String[] args) {
        StringSwapperchecker("Hello", "World");
    }


    static  void StringSwapperchecker(String in1, String in2){
        in1= in1+ in2;
        in2= in1.substring(0, in1.length()- in2.length());
        in1= in1.substring(in2.length());

        System.out.println("After Swapping");
        System.out.println("in1: " + in1);
        System.out.println("in2: "+ in2);
    }
}
