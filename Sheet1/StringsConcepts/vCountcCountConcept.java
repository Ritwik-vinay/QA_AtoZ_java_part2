package StringsConcepts;

public class vCountcCountConcept {
    public static void main(String[] args) {
        vCountcCountChecker vc = new vCountcCountChecker("Great Java");
    }
}
class vCountcCountChecker{
    vCountcCountChecker(String in){
        in=in.toLowerCase();
        int vCount =0;
        int cCount =0;
        for (int i =0;i<=in.length()-1; i++){
            char c= in.charAt(i);
            if (c>='a' && c<='z'){
                if (c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
                    vCount++;
                }
                else {
                    cCount++;
                }
            }
        }
        System.out.println("Vowel are : " + vCount);
        System.out.println("Consonent are : "+cCount);
    }
}
