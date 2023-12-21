
public class Task {
    //DEFINE FIELD FOR THE APP
    private int id;
    private String description;
    private boolean completed;
    private String dueDate;

    //CONSTRUCTOR
    public Task(int id, String description, boolean completed, String dueDate) {
        this.id = id;
        this.description = description;
        this.completed = completed;
        this.dueDate = dueDate;
    }
    //GETTER AND SETTER
    //GETTER TO RECEIVE THE DATA AND SETTER IS TO UPDATE DATA
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public static void main(String[] args) {
        //TESTING OBJECT, METHOD AND OUTPUT
        Task task1 = new Task(12, "Chooping woods in the jungle", false, "2023-12-13");
        Task task2 = new Task(9, "Create a cake", true, "2023-12-10");

//        int task1Id = task1.getId();
//        String task1Description = task1.getDescription();
//        boolean task1Completed = task1.getCompleted();
//        String task1DueDate = task1.getDueDate();


//        System.out.println("Task id: " + task1.getId());
//        System.out.println("Task description: " + task1.getDescription());
//        System.out.println("Task status: " + task1.getCompleted());
//        System.out.println("Task due date: " + task1.getDueDate());
//
//
//        //TESTING UPDATE
//        task1.setDescription("Killing the birds");
//
//        System.out.println("Task description: " + task1.getDescription());
    }





}
