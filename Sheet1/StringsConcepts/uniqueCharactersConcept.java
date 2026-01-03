package StringsConcepts;

public class uniqueCharactersConcept {
    public static void main(String[] args) {
        uniqueCharacterschecker("Java Automation");
    }
 static void uniqueCharacterschecker(String input){
     boolean[] unique = new boolean[128];
     for (int i=0; i<= input.length()-1; i++){
         char ch = input.charAt(i);
         if (!unique[ch]){
             unique[ch]= true;
             System.out.print(ch +" ");
         }
     }
 }
}