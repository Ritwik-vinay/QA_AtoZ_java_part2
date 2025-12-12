package AllTopics;

public class digitsInTheNumberConcept {
    public static void main(String[] args) {
        digitInNumberChecker dn = new digitInNumberChecker(1565);
    }
}
class digitInNumberChecker{
    digitInNumberChecker(int num){
        int a=0;
        if (num<0){
            num= num*-1;
        } else if (num==0) {
            num=1;
        }
        while (num>0){
            num= num/10;
            a++;
        }
        System.out.println(a);
    }
}
