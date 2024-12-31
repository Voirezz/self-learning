public class DoublyLinkedList {
    Node head;
    int size;

    public DoublyLinkedList(){
        head = null;
        size = 0;
    }

    public void add(int data){
        Node nNode = new Node(data);

        if(head == null) {
            head = nNode;
        }
        else {
        Node dummy = head;
        while(dummy.next!= null){
            dummy = dummy.next;
        }
        dummy.next = nNode;
        nNode.prev = dummy;
        }
        size++;
    }

    public void addFirst(int data){
        Node nNode = new Node(data);
        if(head == null){
            head = nNode;
        }
        else {
            Node dummy = head;
            nNode.next = dummy;
            dummy.prev = nNode;
            head = nNode;
        }
        size++;
    }

    public int delete() {
        if(head == null){
            throw new IllegalStateException("Link is empty");
        }
        int pop;

        if(head.next == null){
            pop = head.data;
            head = null;
            return pop ;
        }
        else{
            Node dummy = head;
            while(dummy.next.next != null){
                dummy = dummy.next;
            }
            pop = dummy.next.data;
            dummy.next = null;
        }
        return pop;
    }

    public void print(){
        if(size == 0) System.out.println("Link is empty");
        Node dummy = head;

        while(dummy != null){
            System.out.print(dummy.data + "->");
            dummy = dummy.next;
        }
    }
}
