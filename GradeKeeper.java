import java.util.Arrays;

public class GradeKeeper {

    public static int[] grades = {85,71,92,100,85,68,88,85,78,60};
    public static void main(String[] args) {

       printScores();
    }

    public static void printScores() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
    }
}