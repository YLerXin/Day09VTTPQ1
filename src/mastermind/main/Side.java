package mastermind.main;

import java.util.*;
import java.io.*;
import java.util.random.*;

public class Side {
    
    public String randomGen(){
        Random rand = new Random();

        String randomNum1 = String.valueOf(rand.nextInt(7));
        String randomNum2 = String.valueOf(rand.nextInt(7));
        String randomNum3 = String.valueOf(rand.nextInt(7));
        String randomNum4 = String.valueOf(rand.nextInt(7));
        String randomNum = (randomNum1 + randomNum2 + randomNum3 + randomNum4);

        return randomNum;
    }

    public boolean checkResult(String guess, String ans){
        return guess.equals(ans);
    }



}
