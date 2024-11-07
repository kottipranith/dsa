public class CircularLL {
    DLLNode head;

    CircularLL(){
        head = null;
    }
    
    public DLLNode insertAtBegin(int k, int v){
        DLLNode nn = new DLLNode(k, v);
        nn.next = nn; nn.prev = nn;
        if(head == null){
            head = nn;
        }else{
            DLLNode last = head.prev;
            nn.next = head;
            nn.prev = last;
            last.next = nn;
            head.prev = nn;
            
            head = nn;
        }
        return nn;
    }

    public void printLL(){
        if(head == null)
            return;
            
        System.out.print("[" + head.key + " , " + head.value+ "]" + " -> ");
        for(DLLNode p = head.next; p != head; p = p.next){
            System.out.print("[" + p.key + " , " + p.value+ "]" + " -> ");
        }
        System.out.println("null");
    }
    
    public int deleteLastNode(){

        if(head == null)
            return -1;

        if(head.next == null){
            int deleted = head.key;
            head = null;
            return deleted;
        }
        DLLNode last = head.prev;
        last.prev.next = head;
        head.prev = last.prev;
        return last.key;
    }
    public void moveNodeToFront(DLLNode node){
        if(node == head)
            return;
        node.prev.next = node.next;
        node.next.prev = node.prev;

        DLLNode last = head.prev;
        node.next = head;
        node.prev = last;
        head.prev = node;
        last.next = node;
        head = node;

    }

}
