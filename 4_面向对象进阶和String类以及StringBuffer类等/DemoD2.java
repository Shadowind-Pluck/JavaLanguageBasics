package pro190630;
// 子类
public class DemoD2 extends DemoD1 {
    public DemoD2() {
        super(4);// 指定调用父类的有一个int类型参数的构造器
        System.out.println("我是DemoD2的无参数构造器！");
    }
    public DemoD2(int a) {
        System.out.println("我是DemoD2的有一个int类型参数的构造器！");
    }

    public static void main(String[] args) {
        /*
        当调用构造器的时候一定会产生新的对象，这两者是绑定执行的
        当产生子类对象的时候，会首先产生父类的对象
         */
        // 先父后子
        // 当产生子类对象前，应先产生父类的对象
        /*
        默认情况下，调用父类的无参数构造器产生父类对象
        也可以在子类的构造器的第一行指定调用父类的哪个构造器
         */
        DemoD2 dd2 = new DemoD2();
    }
}
