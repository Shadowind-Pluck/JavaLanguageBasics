package pro190908;
// catch块和finally块的省略问题
public class DemoF {
    public void a() {
        try{
            throw new Exception();
        }/*finally { }*/
        // 对于Exception，不能省略catch，直接用finally，因为Exception异常包含了编译时异常
        catch (Exception e){
            System.out.println("产生了异常！");
        }
    }

    // 注意：若产生的是一个运行时异常，则可以省略catch块，直接使用finally抓住异常
    public void b() {
        try{
            throw new RuntimeException();
        }finally {
            System.out.println("产生了运行时异常！");
        }
    }

    public void c() {
        try{
            throw new ClassNotFoundException();// 编译时异常，不能省略catch，直接用finally
        }/*finally { }*/
        catch (Exception e){
            System.out.println("产生了异常！");
        }
    }
}
/*
注意：
    如果是普通异常，编译器要求必须用catch捕获以便进一步处理
    如果是运行时异常，捕获然后丢弃并且+finally扫尾处理，或者加上catch捕获以便进一步处理，都可以
 */
