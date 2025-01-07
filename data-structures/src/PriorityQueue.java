import java.util.ArrayList;

public class PriorityQueue {
    public ArrayList<Integer> elements;

    public PriorityQueue(){
        elements = new ArrayList<>();
    }

    public void offer(int data){
        if(elements.isEmpty()){
            elements.add(data);
        }
        else {
            elements.add(data);
            comparison();
        }
    }

    public int poll() {
        return elements.remove(0);
    }

    public int peek(){
        return elements.get(0);
    }

    public void print(){
        for(int x : elements){
            System.out.print(x + " ");
        }
    }

    public void comparison(){
        elements.sort((a, b) -> a - b);
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }

    public int size(){
        return elements.size();
    }
}