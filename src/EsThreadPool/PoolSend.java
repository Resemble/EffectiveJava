package EsThreadPool;

import java.util.concurrent.*;

/**
 * @author ranran
 * @version V1.0
 * @Title:
 * @Package mailTest
 * @Description:
 * @date 2017/7/6 15:34
 */
public class PoolSend {

    BlockingQueue<Runnable> workQueue;
    ExecutorService es; // 线程池接口

    public PoolSend() {
        workQueue = new LinkedBlockingQueue<>();
        es = new ThreadPoolExecutor(2, 2,30, TimeUnit.SECONDS, workQueue, new ThreadPoolExecutor.CallerRunsPolicy());
    }

    public void send(Runnable task) {
        System.out.println("PoolSend start ********************** ");
        es.execute(task);
    }

    public void close() {
        es.shutdown();
    }

}
