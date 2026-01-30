package String_10;

public class revTheSentence {
    public static void main(String[] args) {
        revTheSentence rev = new revTheSentence();
        rev.reverseSentence("Software Engineer");
    }


    void reverseSentence(String sentence){
        sentence= sentence.trim().toLowerCase();
        String[] words = sentence.split(" ");
        String rev ="";
       for (String word: words){
           String revword="";
           for (int i= word.length()-1; i>=0;i--){
               revword= revword+word.charAt(i);
           }
           rev= rev+ revword+" ";
       }
        System.out.println(rev );
    }
}
