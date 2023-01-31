
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        TodoList myList = new TodoList("MY LIST:");

        Queue<TodoList.TodoItem> todoList = new PriorityQueue<>();

        todoList.add(new TodoList.TodoItem("Cleaning", "clean the room", 3));
        todoList.add(new TodoList.TodoItem("Insurance", "take care of the car insurance", 4));
        todoList.add(new TodoList.TodoItem("Washing", "wash dishes", 1));
        todoList.add(new TodoList.TodoItem("Reading", "read a book in the evening", 5));
        todoList.add(new TodoList.TodoItem("Shopping", "go grocery shopping", 2));


        System.out.println(myList.getListName());

        while (!todoList.isEmpty()) {
            System.out.println(todoList.remove());
        }

    }

}