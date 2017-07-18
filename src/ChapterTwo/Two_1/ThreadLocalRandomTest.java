package ChapterTwo.Two_1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author ranran
 * @version V1.0
 * @Title:
 * @Package com.spiderdt.common
 * @Description:
 * @date 2017/7/17 17:31
 */
public class ThreadLocalRandomTest {

    public static void main(String[] args) {
        System.out.println(randomIntStr(4));
    }


    public static String randomIntStr(final int n) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            stringBuilder.append(random.nextInt(10));
        }
        System.out.println(stringBuilder);

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append(ThreadLocalRandom.current().nextInt(10, 20));
        }
        return str.toString();
    }
}
