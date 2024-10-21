import java.util.ArrayList;
import java.util.Scanner;

public class toDoList {
    public static void main(String [] args) {
        ArrayList<String> toDoList = new ArrayList<String>();
        menu(toDoList);
    }
    public static String menu(ArrayList<String> toDoList){
        Scanner input = new Scanner(System.in);

        System.out.print("Welcome to your very own dynamic To Do List! \n");
        System.out.print("Please select an option: \n");
        System.out.print("\n x: Add a task \n y: View tasks \n z: Remove a task \n");
        String b = input.next();


        if(b.toLowerCase().equals("x")) addTask(toDoList);
        else if(b.toLowerCase().equals("y")) viewTask(toDoList);
        else if(b.toLowerCase().equals("z")) removeTask(toDoList);

        return menu(toDoList);
    }
    public static void addTask(ArrayList<String> toDoList) {

    }
    public static void viewTask(ArrayList<String> toDoList) {
    System.out.println("Here are all the tasks you must complete.");

    for(String c : toDoList) {
        System.out.print(c);

    }
    menu(toDoList);

    }

    public static void removeTask(ArrayList<String> toDoList) {

    }
}

