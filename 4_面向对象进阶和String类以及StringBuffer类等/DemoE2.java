package pro190630;

public class DemoE2 extends DemoE1 {
    public DemoE2() {
        System.out.println("e2");
    }
    public void b() {
        System.out.println("e2的b");
    }

    public static void main(String[] args) {
        DemoE2 de1 = new DemoE2();
        de1.a();
        de1.b();
        System.out.println("--------------------");
        // 产生了一个子类的对象de2，将de2对象声明为DemoE1类型
        DemoE1 de2 = new DemoE2();
        de2.a();
        //de2.method();// 报错，私有方法
        //((DemoE2) de2).method();// 报错，就算强制类型转换后，也依然不能使用私有方法
        //de2.b();// 只能使用子类与父类共有的，且父类为非私有的方法
        ((DemoE2) de2).b();
    }
}
