else if (difficulty == 3) {
        println("Please choose Rock, Paper, or Scissors.");
        String playerChoice = keyboard.nextLine();
        while (!playerChoice.equals("Rock") && !playerChoice.equals("Paper") && !playerChoice.equals("Scissors")) {
            println("I need either Rock, Paper, or Scissors.");
            playerChoice = keyboard.nextLine();
        }
        if (playerChoice.equals("Rock")) {
          String[] PS = {"Rock", "Scissors"};
          int computerRandom = random(PS.length);
          String[] computerChoices = {"Paper", PS[computerRandom]};
          String finalComChoice = computerChoices[random(computerChoices.length)];
          if (finalComChoice.equals("Paper")) {
                println("You lost. L + Bozo.");
          } else if (finalComChoice.equals(PS[computerRandom]) {
                if (PS[computerRandom].equals("Scissors") {
                        println("You won. Pog.");
                } else if (PS[computerRandom].equals("Rock")) {
                        println("You tied. Kinda mid at this game ngl.");
                }
          }
        }


        
    }
