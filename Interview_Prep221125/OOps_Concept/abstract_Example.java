package OOps_Concept;

public class abstract_Example {
    public static void main(String[] args) {
        vehicle myCar = new car();
        myCar.StartEngine();
        myCar.escalator();
        myCar.brake();
    }
}


class  car extends vehicle{
    @Override
    void escalator() {
        System.out.println("Escalator Pressed ");
    }
    void brake(){
        System.out.println("OverSpeed Brake Pressed !!!_______");
    }
}
abstract class vehicle{
    void escalator(){}
    void brake(){}
    void StartEngine(){
        System.out.println("Engine Started!!!........");
    }
}
