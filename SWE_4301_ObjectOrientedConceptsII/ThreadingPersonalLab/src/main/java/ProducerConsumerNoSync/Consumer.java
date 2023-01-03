package ProducerConsumerNoSync;

import java.lang.*;
import java.util.*;

public class Consumer implements Runnable{
  private final static Random generator = new Random();
  private final Buffer sharedLocation;

  public Consumer(Buffer shared){
    sharedLocation=shared;
  }

  public void run(){
    int sum=0;
    for(int count=0;count<=10;count++)
    {
      try{
        Thread.sleep(300);
        sum+=sharedLocation.get();
        System.out.printf("\t\t\t%2d\n",sum);
      }
      catch(InterruptedException e)
      {
        e.printStackTrace();
      }
      System.out.printf("\n%s %d\n %s\n","Consumer reads values totalling",sum,"Terminating consumer");
    }
  }
}
