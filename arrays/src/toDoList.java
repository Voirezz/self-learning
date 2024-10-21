import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class toDoList {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<String>();
        ArrayList<Character> choice = new ArrayList<Character>();

        choice.add('x');
        choice.add('y');
        choice.add('z');

        toDoList.add("clean my room");

        System.out.print("Welcome to your very own dynamic To Do List! \n");
        System.out.print("Please select an option: \n");
        System.out.print("\n x: Add a task \n y: View tasks \n z: Remove a task \n");

    }

    public static void addTask(ArrayList<String> toDoList) {

    }
    public static void viewTask(ArrayList<String> toDoList) {
    System.out.println("Here are all the tasks you must complete.");
    for(String c : toDoList) {
        System.out.print(c);

    }
    }

    public static void removeTask(ArrayList<String> toDoList) {

    }
}
