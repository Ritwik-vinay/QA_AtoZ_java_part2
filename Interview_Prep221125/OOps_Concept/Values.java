package OOps_Concept;

public class Values{
    void greet(){
        System.out.println("Good Morning");
    }
    String greet(String value){
        value= "Good Evening";
        return value;
    }
    int  intValue(){
        int a = 10;
        return a;
    }
    int intNewVal(int a , int b){
        return a+b;
    }


}
class main{
    public static void main(String[] args) {
        Values values = new Values();
        values.greet();

        System.out.println(values.greet("Afternoon"));
        System.out.println(values.intValue());
        System.out.println(values.intNewVal(5,2));
    }
}
