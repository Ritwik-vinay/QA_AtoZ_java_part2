package AllTopics;

public class ArmstrongNumber3Values {
    public static void main(String[] args) {

        checkArmstrongValue armstrong = new checkArmstrongValue(1634);
    }
}
class  checkArmstrongValue{
     checkArmstrongValue(int num){

         int sum = 0;int  temp= num;
         int digitCount = String.valueOf(num).length();
         while (temp>0){
             int digit = temp%10;
             sum += Math.pow(digit, digitCount);
             temp= temp/10;
         }
         if (sum==num){
             System.out.println("Armstrong");
         }
         else {
             System.out.println("! Not Armstrong");
         }


    }
}
