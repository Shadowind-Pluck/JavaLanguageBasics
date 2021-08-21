package pro190607;

public class DemoC {
    public static void main(String[] args) {
        /*
        DemoA：数据类型
        da1：对象名，给对象起的一个名字，当前对象是一个局部变量
        new DemoA()：产生了一个DemoA的对象
         */
        // 可以只声明一个对象，不会报错，但无法使用
        DemoA da;
        // 只要有new这个关键字，就是新创建的
        DemoA da1 = new DemoA();
        DemoA da2 = new DemoA();
        // 这里没有关键字new，所以使用原来的东西
        DemoA da3 = da1;// 让da3指向da1
        // 类比
        int a = 9;// 让a指向9
        int b = 9;// 让b指向9
        // ==比较的是地址
        System.out.println(da1);
        System.out.println(da2);
        System.out.println(da3);
        System.out.println(da1==da2);
        System.out.println(da1==da3);
        System.out.println(a==b);
        // 如何调用方法 .
        da1.methodA();
        int i1 = da1.methodB1();// 调用methodB1方法会返回一个int类型的结果
        System.out.println(i1);
        int i3 = da1.methodB3();
        System.out.println(i3);
        int i4 = da1.methodB4();
        System.out.println(i4);
        int i5 = da1.methodB5();
        System.out.println(i5);
        da1.methodC1(1,2);// 方法的调用者，需要传递参数，实际参数列表
        /*
        Java中为什么1.2+2.4会是3.5999999999999996而不是3.6
        建议去找“剖析float型的内存存储和精度丢失问题”这篇文章看看
        计算机存储浮点数比如Java的float或者double都是近似值
        如果需要精确运算可以使用BigDecimal类型
         */
        double result = da1.methodC2(1.2,2.4);
        System.out.println(result);
        System.out.println(1.2+2.4);
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        da1.methodC3(array);
        da1.methodC4();// 可以无参数
        da1.methodC4(array);// 可以接收多个参数，也可以接收数组
        da1.methodC4(0,1,2,3,4,5,6,7,8,9);
        da1.methodC4(0);

        DemoB db = new DemoB();
        db.methodA();
    }
}
