package pro190630;

public class DemoC2 extends DemoC1 {
    // 子类重写了父类的方法：方法名与参数列表一致时，视为重写，重写是重写方法体
    /*
    作用域 返回类型 方法名(参数列表) {重写后的方法体}
     */
    public void a() {
        // super：父类的对象
        super.a();// 调用父类的a方法（通过这种方法调用父类的原方法）
        System.out.println("我是DemoC2的a方法！");
    }

    public static void main(String[] args) {
        DemoC2 dc2 = new DemoC2();
        dc2.a();
        dc2.b();
    }
}
