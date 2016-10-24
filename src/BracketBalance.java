import java.util.Scanner;
import java.util.Stack;

/**
 * Created by brainbreaker on 23/10/16.
 */
public class BracketBalance {
    public static Stack<Character> myStack = new Stack<Character>();
    public static boolean isBalanced(String expression) {
        expression.chars().forEach((c) -> {
            if (c == '(' || c == '{' || c == '[') {
                System.out.println(c);
                myStack.push((char) c);
                System.out.println((char)c + " pushed to stack" + " "+ myStack.firstElement().toString().charAt(0));

            } else{
                if (c ==')' && myStack.firstElement().toString().charAt(0)=='('){
                    System.out.println((char)c + " popped from stack");
                    myStack.pop();
                }
                else if (c =='}' && myStack.firstElement().toString().charAt(0)=='{'){
                    System.out.println((char)c + " popped from stack");
                    myStack.pop();
                }
                else if (c ==']' && myStack.firstElement().toString().charAt(0)=='['){
                    System.out.println((char)c + " popped from stack");
                    myStack.pop();
                }
            }
        });
        return myStack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of expressions: ");
        int t = in.nextInt();
        System.out.println("Enter Expression: ");
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
