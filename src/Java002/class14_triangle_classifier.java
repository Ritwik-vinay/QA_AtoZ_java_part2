package Java002;

public class class14_triangle_classifier {
    public static void main(String[] args) {
        triangleValidation tv = new triangleValidation();
        tv.validate_Cond(4,5,6);
    }
}
class triangleValidation{
    void validate_Cond(int side1_c,int side2_c, int side3_c){
        int side1=side1_c;
        int side2=side2_c;
        int side3= side3_c;
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }



    }}
