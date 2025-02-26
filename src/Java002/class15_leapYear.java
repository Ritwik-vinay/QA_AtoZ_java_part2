package Java002;

public class class15_leapYear {
    public static void main(String[] args) {
        leapYear ly = new leapYear();
        ly.leap_Calcultion(2000);
    }
}
class leapYear{
    void leap_Calcultion(int year_c){
        int year=year_c;
        boolean isLeapYear = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}
