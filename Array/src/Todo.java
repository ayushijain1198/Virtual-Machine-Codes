public class Todo {
    int todoId;
    String todoDesc;
    boolean isCompleted;
    public Todo(){

    }
    public Todo(int todoId, String todoDesc, boolean isCompleted){
        this.todoId = todoId;
        this.todoDesc= todoDesc;
        this.isCompleted= isCompleted;
    }
    public String getDetails(){
        return "todo is: "+todoId+"todo description: "+todoDesc+"Completed?"+isCompleted;

    }
}
