package String_10;

public class anagramChecker {
    public static void main(String[] args) {
        anagramChecker ac = new anagramChecker();
        System.out.println(ac.anagramChecker("silent","listen"));
    }

    boolean anagramChecker(String in1 , String in2){
        if (in1.length()!= in2.length()){
            return false;
        }
        int[] cnt = new int[256];
        for (char ch: in1.toCharArray()){
            cnt[ch]++;
        }
        for (char ch : in2.toCharArray()){
            if (--cnt[ch]<0){
                return false;
            }
        }
        return true;
    }
}
