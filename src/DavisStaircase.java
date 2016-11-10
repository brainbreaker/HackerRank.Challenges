import java.util.Scanner;

/**
 * Created by brainbreaker on 11/11/16.
 */
public class DavisStaircase {
    static int a[] = new int[1000001];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 4;
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(getWay(n));
        }
    }

    static int getWay(int n){
        if(a[n]==0){
            a[n] = getWay(n-1) + getWay(n-2) + getWay(n-3);
        }
        return a[n];
    }

}
