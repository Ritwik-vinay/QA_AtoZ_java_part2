package String_10;

public class consVow {
    public static void main(String[] args) {
        countConsVow count = new countConsVow("Ritwik");

    }
}
class countConsVow{
    countConsVow(String input){
        input= input.trim().toLowerCase();
        int vCount=0;
        int cCount =0;
        for ( int i =0; i<input.length();i++){
            if (input.charAt(i)=='a'||input.charAt(i)=='e' ||input.charAt(i)=='o'||input.charAt(i)=='i'||input.charAt(i)=='u'){
                vCount++;
            }
            else {
                cCount++;
            }
        }
        System.out.println("Consonants : " + cCount + " Vowel : "+ vCount);

    }
}