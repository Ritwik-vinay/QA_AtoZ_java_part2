package StringsConcepts;

public class countNumberOfWordsConcept {
    //Java program to count the number of words in a string
    public static void main(String[] args) {
        countNumberOfWords cw = new countNumberOfWords("java Programming language selenium java");
    }
}
class countNumberOfWords{
    countNumberOfWords(String inputStr){
        String[] words = inputStr.toLowerCase().split(" ");
        int count=0;

        for (String word: words){
            count++;
        }
        System.out.println("Number of words in the string is : " + count);
    }
}
