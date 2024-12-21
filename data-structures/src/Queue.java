import java.util.ArrayList;

public class Queue {
    public ArrayList<Integer> elements;

    public Queue(){
    elements = new ArrayList<Integer>();
}

public void push(int item){
        elements.add(item);
}

public int pop(){
        if (elements.isEmpty()){
            throw new IllegalStateException("Queue is empty.");
        }
        return elements.remove(elements.size()-1);
}

public boolean isEmpty(){
        return elements.isEmpty();
}

public int size(){
        return elements.size();
}

}