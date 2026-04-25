import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Task Management System ---");

        while (true) {
            System.out.println("\n1. Add Task | 2. View Tasks | 3. Complete Task | 4. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter task title: ");
                String title = scanner.nextLine();
                tasks.add(new Task(title));
                System.out.println("Task added successfully!");
            } else if (choice == 2) {
                System.out.println("\n--- Your Tasks ---");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
            } else if (choice == 3) {
                System.out.print("Enter task number to complete: ");
                int index = scanner.nextInt() - 1;
                if (index >= 0 && index < tasks.size()) {
                    tasks.get(index).setCompleted(true);
                    System.out.println("Task marked as completed!");
                }
            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            }
        }
        scanner.close();
    }
}
