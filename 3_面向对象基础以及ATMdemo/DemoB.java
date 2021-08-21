package pro190607;
// 属性部分
public class DemoB {
    // 属性，成员变量，其实就是将变量定义到了类中
    // 成员变量未初始化可以使用，原始数据类型默认为0，引用数据类型默认为null
    public int age;// 定义了一个属性age，类型为int，作用域为公开的
    public String name = "张三";// 定义了一个属性name，类型为String，作用域为公开的，初始值为张三
    public char sex;// 定义了一个属性sex，类型为char，作用域为公开的

    public void methodA() {
        int age = 8;
        System.out.println(age);
        // 局部变量与成员变量重名时，在方法里面如何调用成员变量
        System.out.println(this.age);// 如果要调用重名的成员变量，在变量名前加上this.
        // 可以给this前面加当前类名，但不能写别的类名（很好理解，this指的是当前类的对象，写别的类，当然会错误）
        System.out.println(DemoB.this.age);
        System.out.println(name);
        System.out.println(sex);// char默认为ASCII码0——null
        int a = 5;// 局部变量，生命周期是它所定义的程序体
        int b = (int)(Math.random()*100+1);
        if(b%2==0){
            System.out.println("b的值："+b+"\n是偶数");
            // c的生命周期比a还要小
            int c = 6;// 局部变量，生命周期是它所定义的程序体
            System.out.println(c);
        }
        System.out.println(a);
    }
}
/*
成员变量和局部变量的区别？
1.生命周期不同
局部变量存活于它所定义的程序体
成员变量可以在类中直接使用，如果作用域为非私有的，其他类也能使用
2.优先级不同，如果局部变量和成员变量名称相同，以局部变量为主
3.局部变量没有赋值不能使用，而成员变量可以不赋值就使用，有默认值（隐式构造器）
 */
