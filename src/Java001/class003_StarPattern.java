package Java001;

public class class003_StarPattern {
    public static void main(String[] args) {
        int rows =5;
        for (int i = 0; i < rows; i++) {
            for (int j = i; j <=rows-1 ; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
