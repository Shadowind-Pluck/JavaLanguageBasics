package pro190630;

public class DemoH {
    public int a = 3;// 成员变量
    public static int b = 4;// 静态变量

    // 成员方法
    public void a() {
        System.out.println("aaa");
    }

    static {// 不能写在方法里以及类外，可以在类的任意位置
        System.out.println("我是一个块！");
    }

    // 静态方法
    public static void b() {
        System.out.println("bbb");
    }
    static {
        System.out.println("我是另一个块！");
    }

    public static void main(String[] args) {
        System.out.println(b);// 直接使用静态变量
        // 两种写法效果一样
        DemoH.b();
        b();

        DemoH dh = new DemoH();
        System.out.println(dh.a);
        dh.a();
        //dh.b();// 这样写画蛇添足（不过不算错误）
    }
}
