package nestedClass;

/**
 * @author ranran
 * @version V1.0
 * @Title:
 * @Package InnerClass
 * @Description: 匿名类
 * @date 2017/7/2 12:07
 */
public class OuterClass3 {

    public InnerClass getInnerClass(final int num, String str2) {
        return new InnerClass() {
            int number = num + 3;
            @Override
            public int getNumber() {
                return number;
            }
        }; // 注意分号
    }

    public static void main(String[] args) {
        OuterClass3 outerClass3 = new OuterClass3();
        InnerClass innerClass = outerClass3.getInnerClass(2, "resemble");
        System.out.println(innerClass.getNumber());
    }

}
