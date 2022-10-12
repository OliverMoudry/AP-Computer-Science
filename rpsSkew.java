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
          
        }


        
    }
