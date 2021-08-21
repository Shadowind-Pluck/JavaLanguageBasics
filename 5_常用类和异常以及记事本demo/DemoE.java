package pro190908;

import java.util.InputMismatchException;
import java.util.Scanner;

// 异常部分
// 异常：程序在运行过程中出现的不正常现象，就是异常，它会终止正在运行的程序
// 异常的处理：抓住异常、抛出异常
// 抓住异常：try、catch和finally
public class DemoE {
    // 捕获异常情况二
    public static void a() {
        int a = (int)(Math.random()*3);// 0,1,2
        try{
            int b = 8 / a;
            System.out.println(b);// 当出现异常时，不会执行后面的代码（这条代码）
        }catch (Exception e){// Exception是所有异常的父类
            System.out.println("你的代码出现了异常！");
        }
        System.out.println("我是外边的......");// 抓住异常，不会中断程序的执行
    }

    // 捕获异常情况三
    public static void b() {
        int a = (int)(Math.random()*3);// 0,1,2
        try{
            int b = 7 / a;// 如果a为0，7 / 0会产生一个异常对象
            System.out.println("结果是："+b);
        }catch (NullPointerException e){// 产生的异常对象与可以抓住的异常对象类型不匹配
            System.out.println("出现异常情况！");
        }
        System.out.println("后边的代码！");
    }

    public static void c() {
        int a = (int)(Math.random()*3);// 0,1,2
        try{
            int b = 7 / a;// 如果a为0，7 / 0会产生一个异常对象
            System.out.println("结果是："+b);
        }catch (ArithmeticException e){
            System.out.println("出现异常情况！");
        }finally {// 不论什么情况都会执行，就算异常没有被处理掉！
            System.out.println("不论发生什么事情，我总是会出现！");
        }
        System.out.println("后边的代码！");
    }

    // 这个例子非常特殊
    public static int d() {
        try{
            int i = 9 / 0;// 注意：这里就算没有异常，返回值也是8
            return 7;
        }finally {
            return 8;// 无论什么情况finally都是会执行的，所以会覆盖原来的返回值
        }
    }

    public static int e() {
        if(true){
            return 7;// 这个方法的返回值绝对是7，方法执行完return 7;后就已经结束了
        }
        return 8;
    }

    public static void f() {// 多异常处理情况
        Scanner sc = new Scanner(System.in);
        try{
            // 有可能发生两种异常
            int a = sc.nextInt();// 输入的不是整型数据
            int b = 7 / a;// 除零了
            System.out.println(b);
        }catch (ArithmeticException e){
            System.out.println("除零了！");
        }catch (InputMismatchException e){
            System.out.println("输入不合法！");
        }catch (Exception e){
            // 注意：判断异常类型应该是，先子后父
            System.out.println("有异常了！");
        }
        System.out.println("***************");
    }

    public static void g(int len) throws Exception {// throws 声明抛出去了一个什么异常
        if(len<7){
            System.out.println("我准备产生一个异常！");
            throw new Exception();// 抛出去了一个刚产生的异常
        }
    }

    public static void h1() {// 处理异常
        try{
            g(5);
        }catch (Exception e){
            System.out.println("有异常了！");
        }
    }

    public static void h2() throws Exception {// 继续抛出异常
        g(5);
    }

    public static void main(String[] args) {
        //a();
        //b();
        //c();
        /*int i = d();
        int j = e();
        System.out.println(i);
        System.out.println(j);*/
        //f();
        // g(5);会报错，没有处理异常
        //h1();程序正常
        // h2();会报错，还是没有处理异常
    }
}
/*
捕获异常情况一：代码有可能产生异常，也进行了异常处理，
            但是在运行过程中未发生异常，跟catch无关，继续执行其后代码
捕获异常情况二：代码有可能产生异常，也进行了异常处理，
            发生了异常，并且发生的异常跟catch类型匹配，执行catch，然后继续执行其后代码
捕获异常情况三：代码有可能产生异常，也进行了异常处理，
            发生了异常，但是发生的异常跟catch类型不匹配，中断代码，处理失败

异常的分类：
1.Exception是所有异常的父类
2.Exception分为运行时异常（RuntimeException）和编译时异常
    Java三步：编写->编译->运行
    运行时异常：编译可以通过，但是运行无法通过
    编译时异常：编译无法通过

常见的异常：
1.ArithmeticException（数学异常）：一般就是不符合数学规则
2.NullPointerException（空指针异常）：试图引用了一个不存在的对象
3.IndexOutOfBoundsException（越界异常）：超出索引范围（如字符串、数组）
4.SQLException（数据库异常）：Java与数据库连接时出现的异常
5.IOException（IO异常）：输入输出时出现的异常
6.ClassNotFoundException（类没有找到异常）

注意：这三者单词的区别，之间没有关系
final（修饰符，最终的）、finally（异常处理中的代码块）、finalize（Object的方法，由对象的垃圾回收器调用此方法）

1.什么是异常？
2.异常的分类？
3.异常和错误的区别？
异常：程序在运行过程中出现的不正常现象，就是异常，它会终止正在运行的程序（平常所说的错误也是异常）
错误：一个合理的应用程序（代码）在运行过程中发生了不可预知的问题，这些问题是程序员无法解决的
        如内存溢出，发生错误的原因一般是硬件方面，设计方面（不合理）
4.异常有哪些关键字？
有5个关键字：
抓住异常：try（不可省略）、catch（可省略，DemoF中有详细说明，可写多个）、finally（可省略）
抛出异常：throw、throws
5.final、finally、finalize的区别？
6.捕获异常和抛出异常的区别？
捕获异常：处理了异常
抛出异常：没有处理异常，调用其异常方法的方法需要处理或者继续抛出异常
 */
