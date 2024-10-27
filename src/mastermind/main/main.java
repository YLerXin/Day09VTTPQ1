package mastermind.main;

//4pegs per guess
//4 pegs key black and white
//print the table and pegs after every guess

import java.util.*;
import java.io.*;


public class main {

    public static void main(String[] args) {

        Console cons = System.console();
        System.out.println("Lets Play Mastermind");
        Side help = new Side();
        String num;
        ArrayList<String> attempt = new ArrayList<>();

        while(true){
            int cp;
            int c;
            int numGus = 0;
            int numTries = 4;
            String input = cons.readLine("Play or Quit: ").toLowerCase();
            switch(input){
                case("play"):
                    boolean playing = true;
                    num = help.randomGen();
                    
                    while(playing == true){
                        c = 0;
                        cp = 0;
                    String guess = cons.readLine("Input Guess: ");
                    if (guess.toLowerCase().equals("quit")){
                        return;
                    }
                    attempt.add(guess);
                    try{
                        if(((Integer.parseInt(guess)) < 1111) || ((Integer.parseInt(guess)) > 6666)){
                            System.err.println("Out of range my dude");

                        }
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    // List<Integer> position = new ArrayList<>();
                    // for(int i=0; i<num.length();i++){
                    //     if(guess.charAt(i) == num.charAt(i)){
                    //         cp++;
                    //         position.add(i);
                    //     }
                    // }
                    // for(int i=0; i<num.length();i++){ 
                    //         for(int j=0; j<num.length();j++){
                    //                 if(position.contains(j)||position.contains(i)){
                    //                     break;
                    //                 }
                    //                 else if(num.charAt(j) == guess.charAt(i)){
                    //                     c++;
                    //                 }
                            
                    //         }
                    // }

                    //ChatGPT Version
                    cp = 0; // Correct position matches
                    c = 0;  // Correct characters, wrong position
                    boolean[] numUsed = new boolean[num.length()];
                    boolean[] guessUsed = new boolean[guess.length()];
                    
                    // First, count exact matches and mark them as used
                    for (int i = 0; i < num.length(); i++) {
                        if (guess.charAt(i) == num.charAt(i)) {
                            cp++;
                            numUsed[i] = true;
                            guessUsed[i] = true;
                        }
                    }
                    
                    // Next, count misplaced matches without counting duplicates
                    for (int i = 0; i < guess.length(); i++) {
                        if (!guessUsed[i]) { // Only check if not already matched
                            for (int j = 0; j < num.length(); j++) {
                                if (!numUsed[j] && guess.charAt(i) == num.charAt(j)) {
                                    c++;
                                    numUsed[j] = true; // Mark as used to prevent duplicate counting
                                    break;
                                }
                            }
                        }
                    }
                    


                    for (int i=0; i<attempt.size(); i++) {
                        System.out.println(attempt.get(i));
                    }
                    if (help.checkResult(guess, num)){
                        System.out.println( "The correct guess was " + num);
                        System.out.println("You Won!!!");
                        playing = false;
                        break;
                    }

                    numGus++;
                    if(numGus > numTries){
                        System.out.println("You Lost...."); 
                        System.out.println( "The correct guess was " + num);
                        playing = false;
                        break;
                     }

                    else{
                        System.out.printf("You have %d guess in the correct position and %d correct values \n",cp,c);
                        System.out.println("You have " + (numTries - (numGus))+" guesses left.");
                    }


                }
                break;

                case("quit"):
                    System.out.println("Goodbye");
                return;
                // break;

            }

        }
    }

}
