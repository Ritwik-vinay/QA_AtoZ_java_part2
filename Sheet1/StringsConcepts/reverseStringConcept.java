package StringsConcepts;

public class reverseStringConcept {
    public static void main(String[] args) {
        reverseStringChecker reverseString = new reverseStringChecker("Ritwik");
    }
}
class reverseStringChecker{
    reverseStringChecker(String str){
        for (int i =str.length()-1; i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
