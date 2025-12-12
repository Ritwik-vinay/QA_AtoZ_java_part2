package AllTopics;

public class swapTwoNumberConcept {
    public static void main(String[] args) {
        swapTwoNum sn = new swapTwoNum();
        sn.swapTwoNum(5,10);
    }
}

class swapTwoNum{
    void swapTwoNum(int a , int b){
        System.out.println("Before Swap a= "+ a +" Before Swap b= "+ b);
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap a= "+a + " After Swap b= "+  b);

    }
}
