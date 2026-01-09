package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class col_01_ArrayList{
    public static void main(String[] args) {
        //Insert arrayList
        int a[] = {25,42,12,11,10,8,55,10,5,2,3,1};

        ArrayList arr= new ArrayList();
       for (int b: a){
           arr.add(b);
       }
       for (int i =0; i<=arr.size()-1;i++){

          // System.out.println(arr.size());
           System.out.print(arr.get(i) + " ");
       }


    }
}
