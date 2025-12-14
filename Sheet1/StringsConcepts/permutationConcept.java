package StringsConcepts;

public class permutationConcept {
    public static void main(String[] args) {
        new permutationChecker("abc", "");
    }
}
class permutationChecker{
    permutationChecker(String str, String prefix){
        if (str.length()==0){
            System.out.println(prefix);
        }
        else {
            for (int i=0; i<=str.length()-1;i++){
                String rem = str.substring(0,i)+str.substring(i+1);
                new permutationChecker(rem, prefix+str.charAt(i));
            }
        }
    }
}
