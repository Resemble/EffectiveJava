package nestedClass;

/**
 * @author ranran
 * @version V1.0
 * @Title:
 * @Package nestedClass
 * @Description:静态成员类
 * @date 2017/7/2 12:25
 */
public class StaticMember {
    public static class NestClas {
        public void printString() {
            System.out.println("hello world!");
        }
    }

    public static void main(String[] args) {
        // 在外面是使用时候形式如下，在 Main 中使用则不需要加上外部类限定
        StaticMember.NestClas nestClas = new StaticMember.NestClas();
        nestClas.printString();
        NestClas nestClas1 = new NestClas();
        nestClas1.printString();
    }
}


