import java.lang.reflect.Array;
import java.util.*;

public class OneDimensionArray {
  // Print next line method
  public static void println(String string) {
    System.out.println(string);
  }

  // Print method
  public static void print(String string) {
    System.out.print(string);
  }

   // Random number
  public static int random(int bound){
    Random rand = new Random();
    return rand.nextInt(bound);
  }
  // Sleep the program
  static void sleep(int milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

  // Factorial function
  static int factorial(int number) {
    int i,fact = 1;     
    for(i = 1; i <= number; i++){    
      fact = fact * i;    
    }
    return fact;
  }

  public static int[] newArray() { //CREATE LIST ARRAY
    return new int[] {1, 2, 3, 4, 5};
  }

  public static int countAdd(int[] list) { // SET INT VAR SUM = 0 AND FOR I < LIST.LENGTH, ADD THE COUNT OF THE CURRENT INDEX OF LIST 
  int sum = 0;
  for (int i = 0; i < list.length; i++) {
    sum += list[i];
  } 
  return sum;
  }

  public static int searchMaxMin(int[] list) { // TAKE THE INTEGER LIST AND CYCLE THROUGH IT SAVING A MIN AND OVERWRITING IT IF A NEW SMALL NUMBER IS FOUND
    int min = list[0];
    for (int i = 1; i < list.length; i++) {
      if (list[i] < min) {
        min = list[i];
      }
    }
    return min;
  }

  public static int[] swapInsertDelete(int[] list) { // CYCLE THROUGH THE LIST AND SET THE CURRENT INDEX TO THE NEXT INDEX
    for (int i = 0; i < list.length; i++) {
      if (i < list.length - 1) {
        list[i] = list[i+1];
      } else {
        list[i] = (list[i] + 1);
      }
      
    }
    return list;
  }
  
  public static void main (String args[]) {

    for (int i = 0; i < swapInsertDelete(newArray()).length; i++) {
      System.out.println(swapInsertDelete(newArray())[i]);
    }
    

  }


}

