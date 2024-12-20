public class Stack {
    NodeStack head;
    int size;

    public Stack(){
        this.head = null;
        this.size = 0;
    }

    public void push(int value){
        NodeStack newNode = new NodeStack(value);

        if(head != null){
            newNode.next = head;
        }

        head =  newNode;
        size++;
    }

    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }
        int popped = head.data;
        head = head.next;
        size--;
        return popped;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }
}
