package StringsConcepts;

public class SwappingConcept {
    public static void main(String[] args) {
        // Using third variable
        swapperChecker("Hello" , "World");

    }


    static  void swapperChecker(String input1,String input2 ){
        String temp=input1;
        input1=input2;
        input2= temp;
        System.out.println("After swapping "+ input1 + " "+ input2);
    }
}
