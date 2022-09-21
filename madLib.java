import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util;

public class madLib {

    public static String questionQ(){
        Random rand = new Random();
            int randQuestion = rand.nextInt(6);
            String[] questionList = {"Please enter a ", "Enter a ", "I need a ", "Give me a ",
                    "I would like a ", "The computer requires a "};
            String question = questionList[randQuestion];
                return question;

    }

    




    public static String questionWord() {
        String[] wordList = { "verb", "noun", "plural noun", "past tense verb", "adjective", "historic event", "adverb",
                "name of someone in the room", "measurement", "measurement in time" };
        for (int i = 0; i < wordList.length; i++) {
            String word = findIndex(wordList, i);
            return word;
        }
        

    }

    public static String question(String questionWord, String questionQ) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(questionQ() + " " + word + " please.");
        String speechPart = keyboard.nextLine();
        return speechPart;
    }

    public static void main(String[] args) {
       question(questionWord(),questionQ());


        

        //System.out.println("Here is the story you created: ");
       /*System.out.println("Once upon a " + noun1 + " there was a " + animal1 + " who was named "
                + personName1 + ". One fine summer " + noun2 + " , " + personName1 + " was " +
                verb1 + "and they saw a " + adjective1 + " " + noun3 +
                "moving in their direction. " + personName1 + "got really " + adjective2 + ". ");

        /*
         * "Once upon a " + noun1 + " there was a " + animal1 + " who was named "
         * +personName1 + ". One fine summer " + noun2 + " , " + personName1 + " was " +
         * verb1 + "and they saw a " + adjective1 + " " + noun3 +
         * "moving in their direction. " + personName1 + "got really " + adjective2 +
         * ". "
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         */

    }
}
