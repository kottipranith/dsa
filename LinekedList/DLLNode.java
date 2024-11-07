public class DLLNode {
    int key, value; // value is required when solving lru cache question
    DLLNode next, prev;

    public DLLNode(){

    }

    public DLLNode(int k, int v){
        this();
        key = k;
        value = v;
    }
}
