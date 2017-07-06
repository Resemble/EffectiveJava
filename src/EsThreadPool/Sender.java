package EsThreadPool;

/**
 * @author ranran
 * @version V1.0
 * @Title:
 * @Package mailTest
 * @Description:
 * @date 2017/7/6 15:44
 */
public class Sender implements Runnable {

    public Sender() {
        System.out.println("constructor *********** ");
    }

    public void send() {

        System.out.println("I am going to send mail!");
        System.out.println("Thread.currentThread().getName():" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        send();
    }
}
