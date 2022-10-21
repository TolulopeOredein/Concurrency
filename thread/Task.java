package thread;

public class Task implements Runnable{
   private int num1;
   private int num2;
   String taskName;

    @Override
    public void run() {
        System.out.println(dance());
        System.out.println(add(num1, num2));
        System.out.println(getAdd());
        System.out.println(getTaskName());
    }
    public String dance(){
        return "I am dancing";
    }
    public int add(int num1, int num2){
        this.num1= num1;
        this.num2=num2;
        int total = num1+num2;
        return total + 1;
    }

    public int getAdd(){
        return add(num1,num2);
    }

    public void setTaskName(String tsakName){

        this.taskName = taskName;
    }

    public String getTaskName(){

        return taskName;
    }
}
