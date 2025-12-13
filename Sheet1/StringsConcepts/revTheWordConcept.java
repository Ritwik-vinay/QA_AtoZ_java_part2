package StringsConcepts;

public class revTheWordConcept {
    public static void main(String[] args) {
        revTheWordChecker rev = new revTheWordChecker("Learn Java Programming");
    }
}
class revTheWordChecker{
    revTheWordChecker(String str){
        String reverse="";
        String[] allWords= str.split(" ");
        for (int i=0; i< allWords.length;i++){
            String word = allWords[i];
            String nstr="";
            char ch;
            for (int j=0;j< word.length();j++){
                ch= word.charAt(j);
                nstr = ch+ nstr;
            }
            reverse = reverse+ nstr + " ";
        }
        System.out.println(reverse);
    }
}
