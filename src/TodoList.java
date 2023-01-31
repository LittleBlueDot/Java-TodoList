
public class TodoList {

    private String listName;

    public TodoList(String listName){
        this.listName = listName;
    }

    public String getListName() {
        return listName;
    }



    public static class TodoItem implements Comparable<TodoItem>{

        private String taskName;

        private String taskDescription;

        private int priorityLevel;

        boolean isComplete;

        public TodoItem(String taskName, String taskDescription, int priorityLevel){
            this.taskName = taskName;
            this.taskDescription = taskDescription;
            this.priorityLevel = priorityLevel;
        }


        public String getTaskName() {
            return taskName;
        }

        public String getTaskDescription() {
            return taskDescription;
        }

        public int getPriorityLevel() {
            return priorityLevel;
        }

        public boolean isComplete() {
            return isComplete;
        }

        @Override
        public int compareTo(TodoItem todoItem) {
            if(this.getPriorityLevel() > todoItem.getPriorityLevel()) {
                return 1;
            } else if (this.getPriorityLevel() < todoItem.getPriorityLevel()) {
                return -1;
            } else {
                return 0;
            }
        }


        @Override
        public String toString() {
            return taskName +
                    ": " + taskDescription + ", priority level = " + priorityLevel;
        }



    }


}





