package pro191102;
/*
    接口
    1.接口的关键字是interface
    2.接口中的作用域‘只能’是public，不写默认是public
    3.接口没有构造器，不能new
    4.接口中的属性都是常量，不写默认添加 public static final，所以属性必须赋值
    5.接口中的方法都是抽象方法（JDK1.8之后可以有非抽象方法）
    6.接口需要class去实现，关键字为implements，一个类可以实现多个接口
    7.接口可以继承另一个接口
 */
public interface DemoA {
    // 两种写法效果相同
    public static final int A = 2;// 常量名大写
    int B = 4;
    public abstract void a();
    void b();
}

interface DemoA3 {
    void c();
    void d();
}

// 解决报错的两种方案
abstract class DemoA1 implements DemoA {}// 声明为抽象类
class DemoA2 implements DemoA,DemoA3 {// 实现所有接口中的方法
    @Override
    public void a() {
        System.out.println("aaa");
    }

    @Override
    public void b() {
        System.out.println("bbb");
    }

    @Override
    public void c() {
        System.out.println("ccc");
    }

    @Override
    public void d() {
        System.out.println("ddd");
    }

    public static void main(String[] args) {
        DemoA da = new DemoA2();// 多态的一种体现（一个对象，多种数据类型）
        DemoA3 da3 = new DemoA2();
        da.a();
        da.b();
        //da.c();// 不能直接调用c()和d()方法
        ((DemoA2) da).d();// 强制类型转换（向下转型）
        da3.c();
        da3.d();
    }
}
/*
    一.接口和抽象类的区别？
        1.接口是一个规范，而抽象类是一个类
        2.接口没有构造器，但是抽象类有
        3.接口中的作用域只能是public，而抽象类没做约束
        4.一个类可以实现多个接口，但是只能继承一个抽象类
        5.接口的属性是常量，而抽象类可以有变量也可以有常量
        6.接口的方法都是抽象方法，而抽象类可以有非抽象方法
    二.Java支持多继承吗？
        1.支持：Java中通过接口实现了多继承
        2.不支持：Java中的一个类只能继承一个父类
 */
