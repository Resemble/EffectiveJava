package nestedClass;

/**
 * @author ranran
 * @version V1.0
 * @Title:
 * @Package InnerClass
 * @Description: 静态内部类和非静态内部类
 * @date 2017/7/2 11:43
 */
public class OuterClass {

    private String sex = "男";
    public static String name = "resemble";

    /**
     * 静态内部类
     */
    static class InnerClass1 {
        // 可以存在静态成员
        public static String _name1 = "resemble_static";
        
        public void display() {
            /**
             * 静态内部类只能访问外围类的静态成员变量和方法
             * 不能访问外围类的非静态成员变量和方法
             */
            System.out.println("OutClass name:" + name);
        }
    }

    /**
     * 非静态内部类
     */
    class InnerClass2 {
        // 非静态内部类不能存在静态成员
        public String _name2 = "resemble_inner";
        // 可以调用外围类的任何成员，不管是静态的还是非静态的
        public void display() {
            System.out.println("OuterClass name:" + name);
            System.out.println("OuterClass sex:" + sex);
        }
    }

    /**
     * 外围类方法
     */
    public void display() {
        // 外围类访问静态内部类：内部类
        System.out.println(InnerClass1._name1);
        // 静态内部类可以直接创建实例不需要依赖外围类
        new InnerClass1().display();

        // 非静态内部的创建需要依赖于外围类
        OuterClass.InnerClass2 innerClass2 = new OuterClass().new InnerClass2();
        // 方位非静态内部类的成员需要使用非静态内部类的实例
        System.out.println(innerClass2._name2);
        innerClass2.display();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.display();
    }
}
