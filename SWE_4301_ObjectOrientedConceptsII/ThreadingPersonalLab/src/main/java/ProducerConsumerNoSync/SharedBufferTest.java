package ProducerConsumerNoSync;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ProducerConsumerNoSync.UnsynchronizedBuffer;
public class SharedBufferTest {
  public static void main(String[] args)
  {
    ExecutorService application=Executors.newCachedThreadPool();
    Buffer sharedLocation=new UnsynchronizedBuffer();
    System.out.println("Action\t\t\tValue\tSum of produced\tSum of Consumed\n");
    System.out.println("-----\t\t\t-----\t------------\t----------\n");
    application.execute(new Producer(sharedLocation));
    application.execute(new Consumer(sharedLocation));
    application.shutdown();
  }
}
