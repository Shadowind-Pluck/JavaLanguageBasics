package pro190630;
// 子类 DemoB2的父类是DemoB1 extends
// Java是一个单继承效果，一个类只能继承一个父类
public class DemoB2 extends DemoB1 {
    public int e;
    public void d() {
        System.out.println("我是DemoB2的d方法！");
    }

    public static void main(String[] args) {
        DemoB2 db2 = new DemoB2();
        // 调用属性
        db2.b = "aaa";
        db2.c = 'a';
        db2.e = 4;

        // 调用方法
        db2.a();
        db2.c();
        db2.d();
    }
}
