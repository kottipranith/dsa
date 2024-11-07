import java.io.File;
import java.util.Scanner;

public class TrieNodeMain {
    public static void main(String[] args) {
        Trie trie = new Trie();
        try {
            File file = new File("dict.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                trie.insertWord(sc.next());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

//        trie.insertWord("cards");
//        trie.insertWord("car");
//        trie.insertWord("bus");
        System.out.println(trie.hasWord("cards"));
        System.out.println(trie.hasWord("bus"));
        System.out.println(trie.getAllWords());
        System.out.println(trie.getAllStartsWith("s"));
    }
}
