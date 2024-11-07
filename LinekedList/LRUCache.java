import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int capacity, size;
    Map<Integer, DLLNode> mp;

    CircularLL ll;

    LRUCache(int capacity){
        this.capacity = capacity;
        size = 0;
        ll = new CircularLL();
        mp = new HashMap<>();
    }

    public int get(int key){
        if(mp.containsKey(key)){
            DLLNode node = mp.get(key);
            ll.moveNodeToFront(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value){
        if(mp.containsKey(key)){ // update case
            DLLNode node = mp.get(key);
            node.value = value;
            ll.moveNodeToFront(node);
        }
        else{
            if(size < capacity){
                DLLNode node = ll.insertAtBegin(key, value);
                mp.put(key, node);
                size++;
            }else{ // delete recently used  from linked list and map
                int deleted = ll.deleteLastNode();
                mp.remove(deleted);
                DLLNode node = ll.insertAtBegin(key, value);
                mp.put(key, node);
            }
        }
    }
}
