package CodeMonk;

import java.util.Scanner;

/**
 * Created by brainbreaker on 11/11/16.
 */
public class ToggleString {

    public static void main(String args[] ) throws Exception {
        // Scanner
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        System.out.println("The sentence is: "+ sentence);
        StringBuilder toggleSentence = new StringBuilder();
        for(char c: sentence.toCharArray()){
            if(Character.isUpperCase(c)){
               c =  Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)){
               c = Character.toUpperCase(c);
            }

            toggleSentence.append(c);
        }
        System.out.println(toggleSentence);
    }

}
