public class fabonacciSeriesConcept {
    public static void main(String[] args) {
        fabonacciSeries fs = new fabonacciSeries();
        fs.fabonacciSeries(10);
    }
}
class fabonacciSeries{
    void fabonacciSeries(int num){
        int i=0,j=1,next;
        System.out.println("Fabonacci Series is: ");
        for (int k=0; k<=num;k++){
            System.out.print(i + " ");
            next= i+j;
            i=j;
            j=next;
        }
    }
}
