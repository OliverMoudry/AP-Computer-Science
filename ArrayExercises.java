public class ArrayExercises {

  public static void main(String[] args) {

    ex1();
    ex2();
    ex3();
  }

  public static void ex1() {
    double[] rain2015 = {3.33, 3.71, 4.24, 1.69, 0.28, 0.40, 0.57, 0.66, 1.26, 3.69, 4.49, 15.24};

    double total = 0;

    for (double monthRain : rain2015) {
      total += monthRain;
    }
    System.out.println("Total annual rainfall in 2015: " + total);
    System.out.println("Average rainfall per month in 2015: " + total/rain2015.length);
  }


  public static void ex2() {
    int[][] multTable = new int[11][11];

    for (int r = 1; r <= 10; r++) {
      for (int c = 1; c <= 10; c++) {
        multTable[r][c] = r * c;
      }
    }

    for (int r = 1; r <= 10; r++) {
      for (int c = 1; c <= 10; c++) {
        if (c == 10) {
          System.out.println(" ");
        } else {
          System.out.print( multTable[r][c] + " ");
        }
        
      }
    }

  }


  public static void ex3() {

    int[][] assignments = new int[4][3];
    double[] studentOverallAverage = new double[assignments.length];
  
    assignments[0] = new int[] {95, 84, 88};
    assignments[1] = new int[] {78, 93, 86};
    assignments[2] = new int[] {83, 89, 90};
    assignments[3] = new int[] {77, 85, 94};
  
    for (int student = 0; student < assignments.length; student++) {
      int totalPoints = 0;
      for (int grade = 0; grade < assignments[student].length; grade++) {
        totalPoints += assignments[student][grade];
      }
      studentOverallAverage[student] = (double) totalPoints / assignments[student].length;
      System.out.println("Student " + (student + 1) + "'s total grade average is: " + studentOverallAverage[student]);
    }
  
    double classTotal = 0;
    for (double student : studentOverallAverage) {
      classTotal += student;
    }
  
    System.out.println("The class average is: " + classTotal/assignments.length);
  
  }
  

}
