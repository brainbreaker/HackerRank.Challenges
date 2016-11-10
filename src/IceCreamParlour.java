import java.util.Scanner;

/**
 * Created by brainbreaker on 9/11/16.
 */
public class IceCreamParlour {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = scanner.nextInt();

        outerloop:
        for (int q = 0; q < x; x++) {
            System.out.print("Enter value of m: ");
            int m = scanner.nextInt();
            System.out.print("Enter value of n: ");
            int n = scanner.nextInt();
            int a[] = new int[n];
            for (int w = 0; w < n; w++){
                System.out.print("Enter values in the array: ");
                a[w] = scanner.nextInt();
            }

            for(int i=0; i<n; i++) {
                for (int j=i+1; j < n; j++){
                    if(a[i]+a[j] == m){
                        System.out.print(i+1 + " ");
                        System.out.print(j+1);
                        break outerloop;
                    }
                }
            }
        }
    }
}
