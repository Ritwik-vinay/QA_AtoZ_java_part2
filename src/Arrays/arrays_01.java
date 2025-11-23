package Arrays;

import java.sql.Array;
import java.util.Arrays;

public class arrays_01 {
    public static void main(String[] args) {
        // Arrays -> int [] arr = {}, Arrays

        int[] arr= {2,4,5,1,10,7,8,8,9};
        String[] fruits= {"Apple","Mango", "Banana"};
        boolean[] switchNew= {true, false};
//        System.out.println(arr[5]);
//        System.out.println(fruits[1]);
//        for ( int a: arr){
//            System.out.println(a);
//        }
        int max= arr[0];
        int min = arr[0];
        for (int i=0; i<=arr.length-1;i++){

           if (max<arr[i]){
               max= arr[i];
           } else if (min> arr[i]) {
               min = arr[i];
           }
        }

        System.out.println(max + " max value");
        System.out.println(min + " min val");
    }
}
