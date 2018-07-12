//Reference to start with s
//https://www.callicoder.com/java-8-completablefuture-tutorial/

package patterns.Facade.java8asynchronous.CompletableFuture;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class runasync {

    public static void main(String[] args) throws Exception {

        //1.For manually completing a future
        /*
        CompletableFuture<String> completableFuture = new CompletableFuture<String>();
        completableFuture.complete("completing it myself");
        */

        //2.Running   a synchronous task using runAsync , can be done only with runnable
       // /*
        CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                // Simulate a long-running Job
                    try {
                        for(int i = 0 ; i < 10 ; i++) {
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("Child thread : " +Thread.currentThread().getName() + "  printing every 1 second");
                        }
                    }

                 catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            }
        });

        System.out.println("Main thread : "  + Thread.currentThread().getName() +  " will wait for the child");
        TimeUnit.SECONDS.sleep(3);
        future.get();
        System.out.println("Main stopped waiting");
        //*/


    }
}
