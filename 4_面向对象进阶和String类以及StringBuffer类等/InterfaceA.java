package pro190630;
// 创建了一个接口：定义规范
/*
接口的关键字：interface
特点：
1.接口中的方法都是抽象方法（jdk1.8之后接口允许书写非抽象方法）
2.接口只是一个规范，它并不是一个类，接口不能产生对象，接口没有构造器
3.接口中的作用域都必须为public，如果省略默认为public
4.接口中可以定义属性，但是属性都为常量
5.一个接口可以继承另一个接口，且只能继承接口
6.一个类只能继承另一个类（Java是单继承），但是能够实现多个接口
 */
public interface InterfaceA {
    int A = 9;// public static final int A = 9;
    public void a();
    public abstract void b();
    void c();// public abstract void c();
}
