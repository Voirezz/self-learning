import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        menu(toDoList);
    }

    public static void menu(ArrayList<String> toDoList) {
        while (true) {
            System.out.print("\n x: Add a task \n y: View tasks \n z: Remove a task \n q: Quit \n");
            String b = input.nextLine().toLowerCase();

            switch (b) {
                case "x":
                    addTask(toDoList);
                    break;
                case "y":
                    viewTask(toDoList);
                    break;
                case "z":
                    removeTask(toDoList);
                    break;
                case "q":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void addTask(ArrayList<String> toDoList) {
        System.out.println("\n Add a task: ");
        String task = input.nextLine();
        toDoList.add(task);

        System.out.println("Task added. Would you like to add another task? (y/n)");
        String response = input.nextLine().toLowerCase();
        if (response.equals("y")) {
            addTask(toDoList);
        }
    }

    public static void viewTask(ArrayList<String> toDoList) {
        if (toDoList.isEmpty()) {
            System.out.println("You have either completed all your tasks or you've added nothing!");
        } else {
            System.out.println("Here are all your tasks you must complete:");
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
    }

    public static void removeTask(ArrayList<String> toDoList) {
        if (toDoList.isEmpty()) {
            System.out.println("No tasks to remove.");
            return;
        }

        System.out.println("Which number would you like to remove?");
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i + 1) + ". " + toDoList.get(i));
        }

        int index = input.nextInt();
        input.nextLine(); // Consume newline

        if (index > 0 && index <= toDoList.size()) {
            toDoList.remove(index - 1);
            System.out.println("Task removed. Here is your new list:");
            viewTask(toDoList);
        } else {
            System.out.println("Invalid task number.");
        }

        System.out.println("Would you like to remove another task? (y/n)");
        String response = input.nextLine().toLowerCase();
        if (response.equals("y")) {
            removeTask(toDoList);
        }
    }
}

