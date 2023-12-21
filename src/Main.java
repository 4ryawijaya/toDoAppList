import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //First we create TaskManager Object
        TaskManager taskManager = new TaskManager();
        //Create scanner object to receive input
        Scanner scanner = new Scanner(System.in);
        //create var in to receive choice from user
        int choice;

        do {
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Show Task");
            System.out.println("4. Exit");
            System.out.println("Enter your choices: ");
            choice = scanner.nextInt();


            //Using switch to implement user choice and activate the method
            switch (choice) {
                case 1:
                    //Implement add task by using getting user input and put it on task object creation
                    //Get Description
                    System.out.println("Enter ID activities: ");
                    int idTask = scanner.nextInt();

                    System.out.println("Describe your activity: ");
                    String description = scanner.next();

                    //Get task is finish or not (boolean)
                    System.out.println("Is the Task finish? (true/false): ");
                    boolean completed;
                    String userInput = scanner.next();
                    completed = Boolean.parseBoolean(userInput);

                    //get due date
                    System.out.println("Enter Due Date (YYYY-MM-DD): ");
                    String dueDate = scanner.next();

                    //Create Task Object class
                    Task newTask = new Task(idTask, description, completed, dueDate);
                    taskManager.addTask(newTask);
                    System.out.println("Task added 1successfully!");
                    break;
                case 2:
                    //implement delete task
                    System.out.println("Enter the Task Id that you want to delete: ");
                    int taskId = scanner.nextInt();
                    taskManager.deleteTask(taskId);
                    break;
                case 3:
                    //implement show task list
                    taskManager.getAllTask();
                    break;
                case 4:
                    //exit the program
                    System.out.println("Exiting the program, Good bye!");
                    break;
                default:
                    System.out.println("Invalid choices, please try again!");
            }
        } while (choice !=4); //as long user not choose 4 the program(do-while-loop) will always run

        //Don't forget to close the scanner
        scanner.close();
    }
}