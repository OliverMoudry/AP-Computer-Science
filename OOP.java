import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

class School{
    private String first1;
    private String second1;
    private String third1;

    public School(String first, String second,  String third){
        first1 = first;
        second1 = second;
        third1 = third;
    }

    public String toString(){

        return "Your first period is " + first1 + ", your second period is " + second1 + ", and your third period is " + third1;
    }
}
public class OOP {
    public static void main(String [] args){
      Scanner keyboard = new Scanner(System.in);

        
      System.out.print("Give me your first period: ");
      String first = keyboard.nextLine();

      System.out.print("Give me your second period: ");
      String second = keyboard.nextLine();

      System.out.print("Now give me your third period: ");
      String third = keyboard.nextLine();


      School comp1 = new School(first, second, third);
      System.out.println(comp1);
    }
}