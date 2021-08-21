package pro190908;
// 常用类——字符串类——String类
// String是一个不可变字符串类（常量）
public class DemoA {
    // 如何产生一个String类的对象
    public static void a() {
        String str1 = "abc";// 一个对象
        String str2 = new String();// 产生了一个空字符串（一个对象，因为没有参数）
        String str3 = new String("abc");// 两个对象
        char[] chars = {'a','b','c'};
        String str4 = new String(chars);// 两个对象
        byte[] bytes = {97,98,99};
        String str5 = new String(bytes);// 两个对象
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str1=="abc");
        System.out.println(str3=="abc");
    }

    public static void b() {
        String str = "abc";// 让str指向了"abc"
        System.out.println(str);
        str = "bcd";// 让str指向了"bcd","abc"依然存在
        System.out.println(str);
    }

    public static void c() {
        String str = "abcdefg";
        int len = str.length();// 获取字符串的长度
        char chr = str.charAt(3);// 获取指定位置的字符
        boolean b1 = str.equals("abcdefg");// 判断目标字符串和指定字符串的值是否相等
        boolean b2 = str.equalsIgnoreCase("abcDefg");// 不区分大小写
        String str1 = str.toUpperCase();// 全大写
        String str2 = str.toLowerCase();// 全小写
        String str3 = str.trim();// 去除前后空格
        String str4 = str.substring(3);// 截取字符串，从第四个开始
        String str5 = str.substring(3,5);// 截取字符串，从第四个开始，第五个结束
        String str6 = str.concat("888");// 拼接字符串
        String str7 = str+"888";
    }

    public static void d() {
        String str = "ashhuihk";
        int index1 = str.indexOf('a');// 找到'a'在字符串中第一次出现的位置，没有返回-1
        int index2 = str.indexOf("ss");// 找到"ss"在字符串中第一次出现的位置，没有返回-1
        int index3 = str.lastIndexOf('a');// 找到'a'在字符串中最后一次出现的位置，没有返回-1
        int index4 = str.lastIndexOf("aa");// 找到"aa"在字符串中最后一次出现的位置，没有返回-1
        boolean b1 = str.startsWith("abc");// 是否以"abc"开头
        boolean b2 = str.endsWith("abc");// 是否以"abc"结尾
        String str1 = str.replace('a','5');// 替换a——>5
        String str2 = str.replace("aa","bb");// 替换aa——>bb
        char[] chars = str.toCharArray();// 转换成字符数组
        byte[] bytes = str.getBytes();// 转换成字节数组
    }

    public static void e() {
        String str = "ah%sdu%hsui%dh%sjkd";
        String[] array = str.split("%");// 分割字符串
    }

    public static void f() {
        String str1 = "abc";
        String str2 = str1.intern();
        String str3 = new String("abc");
        String str4 = str3.intern();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1==str2);// true
        System.out.println(str1.equals(str2));// true
        System.out.println("--------------------");
        System.out.println(str3==str4);// false
        System.out.println(str3.equals(str4));// false
    }

    public static void main(String[] args) {
        //a();
        //b();
    }
}
