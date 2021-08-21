package pro190630;
// 多态
public class DemoG {
    // 重载
    public void a() {
        System.out.println("aaa");
    }
    public void a(int a) {
        System.out.println("bbb");
    }
    public void a(String a) {
        System.out.println("ccc");
    }

    public static void main(String[] args) {
        System.out.println(4);
        System.out.println(6.5);
        System.out.println('a');
        System.out.println(true);
        System.out.println("aaa");
        DemoG dg = new DemoG();
        dg.a();
        dg.a(3);
        dg.a("aaa");
        //dg.a(8.5);// 报错
    }
}
