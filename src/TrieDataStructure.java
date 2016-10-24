import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by brainbreaker on 24/10/16.
 */
public class TrieDataStructure {

    public class TrieNode{
        HashMap<Character, TrieNode> children;
        boolean endOfWord;
        public TrieNode(){
            children = new HashMap<>();
            endOfWord = false;
        }
    }

    TrieNode root = new TrieNode();

    public void insert(String word){
        TrieNode current = root;
        for (int i = 0; i<word.length(); i++){
           char currentChar = word.charAt(i);
           TrieNode node = current.children.get(currentChar);
            if (node == null){
                node = new TrieNode();
                current.children.put(currentChar, node);
                System.out.println("Character inserted: "+ currentChar);
            }
            current = node;
        }
        current.endOfWord = true;
    }

    public boolean search(String word){
        TrieNode current = root;
        for (int i = 0; i< word.length(); i++){
            char currentChar = word.charAt(i);
            TrieNode node = current.children.get(currentChar);
            System.out.println("Size: "+ node.children.keySet().size());
            if (node == null){
                return false;
            }
            current = node;
        }
        return current.endOfWord;
    }

    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String contact = in.next();
            String operation = in.next();
            insert(contact);
            boolean search = search(operation);
            System.out.println("search boolean:"+ search);
        }
    }
}
