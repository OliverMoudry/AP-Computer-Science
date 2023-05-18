public class Quidditch {
 
    public static void main(String args[]) {
     
        QuidditchPlayer[] allPlayers = new QuidditchPlayer[28];
        String[] teams = {"Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"};
        String[] positions = {"Chaser", "Chaser", "Chaser", "Beater", "Beater", "Keeper", "Seeker"};
     
        int i = 0;
        while (i < allPlayers.length) {
            for (int teamNumber = 0; teamNumber < teams.length; teamNumber++) {
                for (int positionNumber = 0; positionNumber < positions.length; positionNumber++) {
                allPlayers[i] = new QuidditchPlayer(teams[teamNumber], positions[positionNumber]);
                }
            }
        }
        

        System.out.println(allPlayers.toString());
    }    
}