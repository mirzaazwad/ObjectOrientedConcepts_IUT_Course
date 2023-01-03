package Runnable;

import java.util.Random;
import java.util.random.RandomGenerator;

public class PrintTask implements Runnable{
    private final Integer SleepTime;
    private final String taskName;
    private final static RandomGenerator generator= new Random();
    public PrintTask(String name){
        taskName=name;//set task name
        SleepTime=generator.nextInt(500);
    }

    public void run(){
        try{
            System.out.printf("%s going to sleep for %d milliseconds. \n",taskName,SleepTime);
            Thread.sleep(SleepTime);
        }
        catch(InterruptedException e){
            System.out.printf("%s %s\n",taskName,"Terminated prematuredly due to interruption");
        }
        System.out.printf("%s done sleeping\n",taskName);
    }
}
