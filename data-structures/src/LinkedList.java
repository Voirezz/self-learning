public class LinkedList {
    Node head;
    int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void offer(int data) {
        Node nNode  = new Node(data);

        if(head == null){
            head = nNode;
        }
        else {
        Node dummy = head;

        while(dummy.next != null){
            dummy = dummy.next;
        }
        dummy.next = nNode;
        }
        size++;
    }

    public void frontOffer(int data){
        Node nNode = new Node(data);
        nNode.next = head;
        head = nNode;
        size++;
    }

    public int poll() {
        if(head == null) throw new IllegalStateException("Link is Empty");

        int polled;

        if(head.next == null){
            polled = head.data;
            head = null;
        }

        Node dummy = head;
        while(dummy.next.next != null){
            dummy = dummy.next;
        }

        polled = dummy.next.data;
        dummy.next = null;

        size--;
        return polled;
    }
}
