public class TrieNode {
    boolean isEOW;
    TrieNode children[];
    TrieNode(){
        this.isEOW = false;
        children = new TrieNode[26];
    }
}
