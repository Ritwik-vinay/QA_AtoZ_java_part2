package StringsConcepts;

public class tryCatchConcepts {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int result1 = 0;
        try {
            int result = a/b;
            System.out.println(result);

        }
        catch (ArithmeticException e){
            System.out.println(e);

        }
        System.out.println("Program continues...");
        try {
            int[] arr= new int[3];
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of Bounds Exception");
        }
    }
}
