package EsThreadPool;

/**
 * @author ranran
 * @version V1.0
 * @Title:
 * @Package mailTest
 * @Description:
 * @date 2017/7/6 16:11
 */
public class test {
    public static void main(String[] args) {


        PoolSend poolSend = new PoolSend();
        Sender sender = new Sender();
        Sender sender1 = new Sender();
        Sender sender2 = new Sender();

        poolSend.send(sender);
        poolSend.send(sender1);
        poolSend.send(sender2);


    }
}
