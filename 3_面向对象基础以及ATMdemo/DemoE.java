package pro190607;

import java.util.Scanner;

public class DemoE {
    String name;
    int age;
    char sex = '男';// 初始化了sex，隐式构造器不起作用
    // 如果未书写构造器，则系统自带的构造器（隐式构造器）起作用，负责给未初始化的属性（成员变量）赋值
    // 基本数据类型：0（boolean：false） 引用数据类型：null
    // 隐式构造器是无参数的构造器，形参列表为空

    // 显式构造器
    /*
    当书写了显式构造器，隐式构造器无法手动调用
    注意理解手动调用的意思：
    1.就算书写了显式构造器，但是显示构造器没有做任何赋值操作，系统依然会使用隐式构造器赋值，只是你无法直接使用隐式构造器
    2.如果书写了有参显式构造器，没有书写无参显式构造器，正常的声明对象（使用无参构造器）会报错，必须写参数或书写无参构造器
     */
    public DemoE() {// 创建了一个无参数的构造器
        // 注意：如果显式构造器未给属性赋值，系统会让隐式构造器自动给未初始化的属性（成员变量）赋值
    }
    // 一个类可以有多个构造器，用参数来区分构造器
    /*
    注意：如果声明这样的构造器会报错，因为形参注重的是类型，不是形参名
    public DemoE(int a) { }
     */
    public DemoE(int age) {
        // 如果成员变量和局部变量重名，使用this来获取成员变量
        this.age = age;// this指的是当前类的对象
    }
    public DemoE(String name) {
        this.name = name;
    }
    public DemoE(int age,String name) {
        this.age = age;
        this.name = name;
    }
    public DemoE(int age,String name,char sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public void print() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
    }

    // 注意：main方法是一个独立的方法，和DemoE没有关系，main方法如果要使用DemoE的属性和方法，需要创建对象（关键词：static）
    public static void main(String[] args) {
        /*
        DemoE de = new DemoE();
        1.声明了一个变量：类型是DemoE，名称是de
        2.创建了一个对象，并且将对象的值赋予了de（让de指向这个新创建的对象）
        3.调用了DemoE类的无参数构造器来初始化对象（给属性赋值）
         */
        /*
        什么时候调用构造器——new的时候
        new会进行两个操作，一是产生一个对象，二是通过构造器给对象的属性赋初始值
         */
        DemoE de = new DemoE(7,"张三",'女');// 实际参数列表
        de.print();

        // 这就是一个典型的创建对象的过程，调用了有一个参数的构造器
        Scanner sc = new Scanner(System.in);
        //int i = sc.nextInt();// 调用了sc的nextInt这个无参数方法
    }
}
/*
1.什么是构造器：构造器就是给对象进行初始化操作的
2.如何调用构造器：通过new来调用，根据实际参数列表来决定调用那个构造器
3.构造器赋值的顺序（注意总结）
 */
