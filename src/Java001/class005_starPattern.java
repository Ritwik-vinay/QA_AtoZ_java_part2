package Java001;

public class class005_starPattern {
    public static void main(String[] args) {
        int rows=5;
        for (int i= rows-1; i>=1;i--){
            for (int j = rows-i; j >1 ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
