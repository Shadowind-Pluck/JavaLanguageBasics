package pro190630;
// 接口
public class DemoI implements InterfaceA,InterfaceB {// 实现接口快捷键：ctrl+i
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }

    public static void main(String[] args) {
        DemoI di1 = new DemoI();// di1可以使用a，b，c，d四个方法
        InterfaceA di2 = new DemoI();// di2可以使用a，b，c三个方法
        InterfaceB di3 = new DemoI();// di3可以使用d一个方法
    }
}
