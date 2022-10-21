package thread;

public class DriverClass {
    public static void main(String[] args) throws InterruptedException {
//       Creating a thread using Runnable Interface. Thread per class.

        Task task2 = new Task();
        Runnable task1 = new Task();
        Task task3 = new Task();

        task2.add(1,9);
        task3.add(2,7);

//      Create Threads(workers) and add tasks to them.
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

//       get states of the threads
        System.out.println("Thread 1: " + thread1.getState());
        System.out.println("Thread 2: " + thread2.getState());
        System.out.println("Thread 3: " + thread3.getState());

        thread1.start();
        thread2.start();
        thread3.start();

//      pause thread1
        thread1.sleep(10000);

//      get states of the threads

        System.out.println("Thread 1: " + thread1.getState());
        System.out.println("Thread 2: " + thread2.getState());
        System.out.println("Thread 3: " + thread3.getState());

//      Get ContextClassLoader for each thread

        System.out.println( "Thread1 ContextClassLoader name is: " + thread1.getContextClassLoader().getName().toUpperCase());
        System.out.println( "Thread2 ContextClassLoader name is: " + thread2.getContextClassLoader().getName().toUpperCase());
        System.out.println( "Thread3 ContextClassLoader name is: " + thread3.getContextClassLoader().getName().toUpperCase());

//        Set thread names
        thread1.setName("Tolulope");
        thread2.setName("Abel");
        thread3.setName("Helen");

//      get thread names
        System.out.println("Thread1 is: " + thread1.getName());
        System.out.println("Thread2 is: " + thread2.getName());
        System.out.println("Thread3 is: " + thread3.getName());

        System.out.println( ClassLoader.getSystemClassLoader());

        System.out.println("Inside the main thread");
        if (thread1.getState()== Thread.State.RUNNABLE ){
            System.out.println("thread1 is now Runnable");
        }else if(thread1.getState() == Thread.State.TERMINATED){
            System.out.println("Thread1 has been terminated finally");
        }
        else if(thread1.getState() == Thread.State.BLOCKED){
            System.out.println("thread1 has been blocked");
        }
        else if(thread1.getState() == Thread.State.TIMED_WAITING){
            System.out.println("thread1is timed waiting");
        }
    }
}
