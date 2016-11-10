/**
 * Created by brainbreaker on 10/11/16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Primarility {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            if(checkPrime(n)){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
        }
    }

    public static boolean checkPrime(int n){
        int p = (int) Math.sqrt(n);
        for(int i = 2; i<=p; i++){
            if(n % i == 0 ){
                return false;
            }
        }
        return true;
    }
}
