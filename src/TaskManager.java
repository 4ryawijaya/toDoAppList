import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class TaskManager {
    /*
    This use to store list of task.
    Show the list of task
    Operate to delete task based on Id
    */

    //having the program create array class object
    private List<Task> taskList;

    //constructor
    public TaskManager(){
        this.taskList = new ArrayList<>();
    }

    //METHODS
    public void addTask(Task task) {
        taskList.add(task);
    }

    public void deleteTask(int taskId) {
        //create iterator object
        Iterator<Task> iterator = taskList.iterator();
        while (iterator.hasNext()) {
            //we need to create task object first and we can call the class method from Task.java
            Task task = iterator.next(); //THIS IS TASK OBJECT
            if (task.getId() == taskId) {
                //if true
                //run delete row
                iterator.remove();
                System.out.println("Successful delete the task");
            } else {
                System.out.println("Cannot find the id");
            }
        }
    }

    public List<Task> getAllTask() {
        return new ArrayList<>(taskList);
    }

}
