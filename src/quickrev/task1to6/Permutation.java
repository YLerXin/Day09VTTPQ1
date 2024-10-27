package quickrev.task1to6;

import java.util.*;
import java.io.*;

public class Permutation {
    public static void main(String[] args) {
        // if(args.length < 1){
        //     System.err.println("Please input 4 Alphabets");
        // }
        try{
        // String alphabets = args[0];
        Console cons = System.console();
        String input = cons.readLine("Enter the String: ");
        System.out.println(input +"\n" + getPermutation(input));



        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public static Set<String> getPermutation(String str){
        Set<String> set = new HashSet<>();
        if(str == null){
            return null;
        }else if(str.length() == 0){
            set.add("");
            return set;
        }
        char first = str.charAt(0);

        String sub = str.substring(1);

        Set<String> words = getPermutation(sub);

            // access each element from words
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
    
            // insert the permutation to the set
           set.add(strNew.substring(0, i) + first + strNew.substring(i));
            }
        }
        return set;
    }


    }

