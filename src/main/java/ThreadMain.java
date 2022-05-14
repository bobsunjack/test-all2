import java.util.concurrent.*;

public class ThreadMain {

    private static LinkedBlockingQueue executeQueue = new LinkedBlockingQueue<Runnable>();
    private static Executor executor ;
    private static ExecutorService  executorService ;
    static {
        executor= new ThreadPoolExecutor(10000, 10000,
                1000*3L, TimeUnit.MILLISECONDS,executeQueue
        );

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            executor.execute(new Run(i+""));
            System.out.println(((ThreadPoolExecutor)executor).getActiveCount());

        }
        System.out.println("finish-------------------");
    }
}
