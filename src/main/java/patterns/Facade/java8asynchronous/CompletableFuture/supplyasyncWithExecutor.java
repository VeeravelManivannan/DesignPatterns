//Reference to start with s
//https://www.callicoder.com/java-8-completablefuture-tutorial/

//Question
//How to interrupt a completable future . which does not use an executor service ?
//Some reference below
//https://www.nurkiewicz.com/2015/03/completablefuture-cant-be-interrupted.html

//Still the question remains , even with executor service , how to interrupt the thread ?

package patterns.Facade.java8asynchronous.CompletableFuture;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class supplyasyncWithExecutor {

    public static void main(String[] args) throws Exception {

        //Logic for the child thread
        ExecutorService executor = Executors.newFixedThreadPool(1);
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(new Supplier<String>()
        {
            @Override
            public String get()
            {
                for(int i = 0 ; i <10 ; i++) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        //e.printStackTrace();
                        System.out.println("Child Thread interrupted");

                    }
                    System.out.println("Child thread : " +Thread.currentThread().getName() + "  printing every 1 second");
                }

                return "success" ;
            }
        },executor);

        //Logic to get the result (wait and get the result)

        System.out.println("Parent thread : " +Thread.currentThread().getName() + "  started to wait fro child");
        TimeUnit.SECONDS.sleep(4);
        //String result = completableFuture.get();


        executor.shutdownNow();
        completableFuture.complete("dummy result");

        //scompletableFuture.cancel(false);
        //completableFuture.get();




        System.out.println("Parent thread : " +Thread.currentThread().getName() + "  completed waiting for child");
    }
}

