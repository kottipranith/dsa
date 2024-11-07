import java.util.ArrayList;
import java.util.List;

public class Trie {
    TrieNode root;
    Trie(){
        root = new TrieNode();
    }

    public boolean insertWord(String word){
        TrieNode temp = root;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            int idx = ch-'a';
            if(temp.children[idx] == null){
                TrieNode newNode = new TrieNode();
                temp.children[idx] = newNode;
            }
            temp = temp.children[idx];
        }
        if(temp.isEOW == true)
            return false;
        return temp.isEOW = true;
    }

    public boolean hasWord(String word){
        TrieNode temp = root;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            int idx = ch-'a';
            if(temp.children[idx] == null)
                return false;
            temp = temp.children[idx];
        }
        return temp.isEOW;
    }

    public List<String> getAllWords(){
        List<String> ans = new ArrayList<>();
        helper(root, "", ans);
        return ans;
    }

    public void helper(TrieNode root, String cur, List<String> ans){
        if(root == null)
            return;
        if(root.isEOW == true){
            ans.add(cur);
        }

        for(int i = 0; i < 26; i++){
            char ch = (char)('a'+i);
            helper(root.children[i], cur + ch, ans);
        }
    }

    public List<String> getAllStartsWith(String prefix){
        List<String> ans = new ArrayList<>();
        TrieNode temp = root;
        for(int i = 0; i < prefix.length(); i++){
            int idx = prefix.charAt(i)-'a';
            if(temp.children[idx] == null)
                return ans;
            temp = temp.children[idx];
        }
        helper(temp, prefix, ans);
        return ans;
    }
}
