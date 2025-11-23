package OOps_Concept;

public class polymorphismExample {
    public static void main(String[] args) {
        Salary salary = new Salary();
        NewSal newSal= new NewSal();

        Salary polymor = new NewSal();
        // Method Overloading (compile-time)
        salary.detail();
        salary.detail(10);
        // Method Overriding (runtime)
        newSal.detail(20);
        // Polymorphism in action
        polymor.detail(30);
    }
}
class NewSal extends Salary{
    @Override
    public void detail(int a){
        System.out.println("Revised sal is 1cr" + a);
    }
}
class Salary{
    public void detail(){
        System.out.println("My sal is 1cr");
    }
    public void detail(int a){
        System.out.println("My sal is 1cr" + a);
    }


}
