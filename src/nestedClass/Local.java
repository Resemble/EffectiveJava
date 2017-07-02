package nestedClass;

/**
 * @author ranran
 * @version V1.0
 * @Title:
 * @Package nestedClass
 * @Description: 局部类
 * 1.同局部变量，局部类不能用public，private，protected，static修饰，但可以被final或者abstract修饰。
   2.可以访问其外部类的成员
   3.不能访问该方法的局部变量，除非是final局部变量。
 * @date 2017/7/2 12:36
 */
public class Local {
    {
        class AA{} // 块内局部类
    }

    public Local() {
        class AA {} // 构造器局部类
    }
    public static void main(String[] args) {

    }

    public void test() {
        class AA{} // 方法局部类
    }
}
