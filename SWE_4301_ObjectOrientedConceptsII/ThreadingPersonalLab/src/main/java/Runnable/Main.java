package Runnable;

public class Main{
    public static void main(String[] args){
        System.out.println("Thread creation");
            Thread thread1=new Thread(new PrintTask("task1"));
            Thread thread2=new Thread(new PrintTask("task2"));
            Thread thread3=new Thread(new PrintTask("task3"));
            System.out.println("Thread creation done, main calls of thread");
            System.out.println("Main call of thread 1");
            thread1.start();
            System.out.println("Main call of thread 2");
            thread2.start();
            System.out.println("Main call of thread 3");
            thread3.start();
            System.out.println("Reached end of main");
    }
}