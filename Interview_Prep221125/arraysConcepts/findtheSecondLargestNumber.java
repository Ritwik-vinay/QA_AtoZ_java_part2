package arraysConcepts;

import java.util.Collection;
import java.util.Collections;

public class findtheSecondLargestNumber {
    public static void main(String[] args) {
        int[] arr ={10,25,7,99,45};
        int max=0;
        int secMax=0;

        for (int i=0; i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }

            }
        }
        System.out.println(arr[1]);
    }
}
