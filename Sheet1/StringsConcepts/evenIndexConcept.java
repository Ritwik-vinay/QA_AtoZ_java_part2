package StringsConcepts;

public class evenIndexConcept {
    public static void main(String[] args) {
        evenIndexConcept("Automation");
    }

    static void evenIndexConcept(String input){
        //Java program to print even indexed characters
        for (int i=0; i< input.length();i++){
            if (i%2==0){
                System.out.print(input.charAt(i) + " ");

            }
        }
    }
}
