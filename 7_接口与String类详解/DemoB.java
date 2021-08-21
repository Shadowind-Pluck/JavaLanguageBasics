package pro191102;
// 字符串——String类
public class DemoB {
    // 如何产生字符串
    public static void a() {
        // 产生了一个对象str1，值为abc
        String str1 = "abc";
        // 产生了两个对象，一个是abc，一个是str2
        String str2 = new String("abc");// 以abc为模板复制了一个新字符串str2
        String str3 = new String();// 产生一个空字符串
        char[] chars = {'a','b','c','d','e'};
        String str4 = new String(chars);
        String str5 = new String(chars,1,2);
        byte[] bytes = {97,98,99,100,101};
        String str6 = new String(bytes);
        String str7 = new String(bytes,1,2);
        String str8 = null;
        /*
        Java空字符串与null的区别：
        1、类型
        null表示的是一个对象的值，并不是一个字符串。例如声明一个对象的引用，String a = null;
        ""表示的是一个空字符串，也就是说它的长度为0。例如声明一个字符串String str = "";
        2、内存分配
        String str = null;表示声明一个字符串对象的引用，但指向为null，也就是说还没有指向任何的内存空间；
        String str = "";表示声明一个字符串类型的引用，其值为""空字符串，这个str引用指向的是空字符串的内存空间；
        在java中局部变量（基本类型）和对象的引用是存放在栈中（stack），而对象（new产生的）都是存放在堆中（heap）
        就如下：
        String str = new String("abc");
        ps：=左边的是存放在栈中（stack），=右边是存放在堆中（heap）。
        字符串对象与null的值不相等，且内存地址也不相等；
        空字符串对象与null的值不相等，且内存地址也不相等；
        new String()创建了一个字符串对象，默认值为""（String类型成员变量的初始值为null）
         */
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
    }

    // 多个对象的问题
    public static void b() {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1==str2);// 比较两个对象的地址是否相等
        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str3==str4);
        System.out.println(str1==str3);
        System.out.println(str1=="abc");
        System.out.println(str3=="abc");
    }

    // String为什么是常量
    public static void c() {
        String str = "abc";
        System.out.println(str);
        str = "bcd";// 只是更改了str的引用，使str指向了"bcd"，"abc"依然存在
        System.out.println(str);
    }

    public static void main(String[] args) {
        //a();
        //b();
        //c();
    }
}
