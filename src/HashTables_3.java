import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by brainbreaker on 22/10/16.
 */
public class HashTables_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of words in magazine: ");
        int m = in.nextInt();
        System.out.println("Enter number of words in ransom note: ");
        int n = in.nextInt();
        String magazine[] = new String[m];
        System.out.println("Enter words in magazine: ");
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        System.out.println("Enter words in ransom: ");
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }

        HashMap magTable = new HashMap();
        for (int i =0; i< magazine.length; i++) {
            magTable.put(magazine[i],i);
        }
        boolean match = false;
        for (String str: ransom) {
            System.out.println("String str: " + str);
            match = magTable.containsKey(str);
            if (!match)
                System.out.println("No");
            else
                magTable.remove(str);
        }

        if (match){
            System.out.println("Yes");
        }
    }
}
