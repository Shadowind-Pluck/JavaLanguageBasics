package pro190519;

public class DemoB {
    public static void main(String[] args) {
        // 跟变量相关内容
        // 原始数据类型
        // 整型相关
        byte a1 = 3;// -128,127
        short a2 = 4;// -32768,32767
        int a3 = 7;// -2147483648,2147483647
        long a4 = 9;// -9223372036854775808,9223372036854775807
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        // 浮点型
        float b1 = 7f;// f的作用是声明f前的数是float型
        double b2 = 9d;// d的作用是声明d前的数是double型
        float b3 = 10;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        // 布尔类型 只有两个值true/false
        boolean c1 = true;
        boolean c2 = false;
        System.out.println(c1);
        System.out.println(c2);
        // 字符型 char 单个字符，使用''括起来（里面只能书写一个，不能书写零个或一个以上），或者书写ASCII
        char d1 = 'i';// 单引号中只能书写一个字符
        char d2 = 97;// 48:0 65:A 97:a（总共有65536个ASCII：0~65535）
        System.out.println(d1);
        System.out.println(d2);

        // 引用数据类型
        // 字符串
        String e = "你好，中国";
        System.out.println(e);

        // 常见问题
        int f;// 声明了一个变量f
        f = 4;// 第一次赋值：初始化
        System.out.println(f);// 变量没有初始化，无法使用
    }
}
