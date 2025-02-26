package Java002;

public class class13_grade_calc_ {
    public static void main(String[] args) {
        grade g = new grade();
        g.grading_marks(84);
    }

}
class grade{
    void grading_marks(int score_c) {
        int score = score_c;
        char grade = ' ';
        if (score >= 90 && score <= 100) {
            grade = 'A';
            System.out.println(grade);
        } else if (score >= 80 && score < 90) {
            grade = 'B';
            System.out.println(grade);
        } else if (score >= 70 && score < 80) {
            grade = 'C';
            System.out.println(grade);
        } else if (score >= 60 && score < 70) {
            grade = 'D';
            System.out.println(grade);
        } else {
            grade = 'F';
            System.out.println(grade);
        }

    }

}