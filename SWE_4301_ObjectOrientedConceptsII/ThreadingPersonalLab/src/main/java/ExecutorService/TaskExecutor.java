package ExecutorService;
import Runnable.PrintTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {
    public static void main(String[] args){
        PrintTask task1=new PrintTask("task1");
        PrintTask task2=new PrintTask("task2");
        PrintTask task3=new PrintTask("task3");
        System.out.println("Task Execution Starts");
        ExecutorService threadExecutor= Executors.newCachedThreadPool();
        threadExecutor.execute(task1);
        threadExecutor.execute(task2);
        threadExecutor.execute(task3);
        threadExecutor.shutdown();
        System.out.println("Thread starts,main ends");
    }
}
