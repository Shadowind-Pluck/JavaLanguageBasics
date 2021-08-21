package pro190630;

import java.util.Arrays;

// 讲解String类————>常量字符串（值不可以修改的字符串）
public class DemoS {
    // 如何产生String字符串
    public void a() {
        // 产生一个字符串"abc"，让变量str1指向了这个字符串
        String str1 = "abc";
        // 通过构造器产生了一个空字符串
        String str2 = new String();// 空的
        /*
        产生了一个字符串"abc"，并且以这个字符串为模板创建了一个对象str3
        注意：这里实际上产生了两个对象，一个是"abc"，一个是以"abc"为模板产生的str3
         */
        String str3 = new String("abc");
        // 以字符数组为蓝本创建一个新字符串str4
        char[] chars = {'a','b','c'};
        String str4 = new String(chars);
        // 以字节数组为蓝本创建一个新字符串str5
        byte[] bytes = {97,98,99};
        String str5 = new String(bytes);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }

    // 比较字符串
    public void b() {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = new String("abc");
        String str5 = new String(str1);
        String str6 = new String(str3);
        System.out.println(str1==str2);// true
        System.out.println(str1==str3);// false
        System.out.println(str1==str4);// false
        System.out.println(str1==str5);// false
        System.out.println(str1==str6);// false
        System.out.println(str3==str4);// false
        // new是以其为蓝本复制出来的，所以只要new，地址值就与原来的蓝本不同了，==比较的是地址值
    }

    // String为什么是一个常量
    public void c() {
        String str = "abc";
        System.out.println(str);
        /*
        注意：这里看似是改变了str的值，实际上是让str指向了"bcd"
        "abc"没有消失，依然在内存中，只是重新创建了"bcd"，然后让str指向了它
         */
        str = "bcd";
        System.out.println(str);
    }

    // String类的常用方法①
    public void d() {
        String str = " abc hsu dhs  ud  ";
        int len = str.length();// 获取字符串的长度
        System.out.println(len);
        char chr = str.charAt(3);// 获取字符串指定位置的字符，Java中大部分索引都是从0开始的
        System.out.println(chr);
        boolean b = str.isEmpty();// 判断字符串是否为空
        System.out.println(b);

        // 注意：trim()方法并不是改变str，而是以str为蓝本重新创建了一个修改后的字符串，再让str1指向它
        String str1 = str.trim();// 返回字符串去掉前后空格后的形式
        System.out.println(str);
        System.out.println(str1);
    }

    // String类的常用方法②
    public void e() {
        String str = "ashDJkdhsKljd";
        String str1 = str.toLowerCase();// 返回字符串的纯小写形式
        System.out.println(str1);
        String str2 = str.toUpperCase();// 返回字符串的纯大写形式
        System.out.println(str2);
        int hashCode = str.hashCode();// 获取字符串的哈希码
        System.out.println(hashCode);

        // 注意：这里的equals()方法重写了Object中的equals()方法，Object中的equals()方法是比较地址
        boolean b1 = str.equals("ashdJkdhsKljd");// 比较两个字符串的值是否相等
        System.out.println(b1);
        boolean b2 = str.equalsIgnoreCase("ashdJkdhskljd");// 比较两个字符串的值是否相等，不区分大小写
        System.out.println(b2);
    }

    // String类的常用方法③
    public void f() {
        String str = "ashdhdjkshdjksdsd";
        // 在目标字符串中查找字符'h'第一次出现的位置，如果不存在返回-1
        int index1 = str.indexOf('h');
        // 从目标字符串中的第五个开始查找字符'h'第一次出现的位置，如果不存在返回-1
        int index2 = str.indexOf('h',4);
        // 在目标字符串中查找字符串"hd"第一次出现的位置，如果不存在返回-1
        int index3 = str.indexOf("hd");
        // 从目标字符串中的第五个开始查找字符串"hd"第一次出现的位置，如果不存在返回-1
        int index4 = str.indexOf("hd",4);
        // 在目标字符串中查找字符'h'最后一次出现的位置，如果不存在返回-1
        int index5 = str.lastIndexOf('h');
        // 从目标字符串中的第五个开始反向查找字符'h'第一次出现的位置（也就是前五个字符中'h'最后一次出现的位置），如果不存在返回-1
        int index6 = str.lastIndexOf('h',4);
        // 在目标字符串中查找字符串"hd"最后一次出现的位置，如果不存在返回-1
        int index7 = str.lastIndexOf("hd");
        // 从目标字符串中的第五个开始反向查找字符串"hd"第一次出现的位置（也就是前五个字符中"hd"最后一次出现的位置），如果不存在返回-1
        int index8 = str.lastIndexOf("hd",4);
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
        System.out.println(index5);
        System.out.println(index6);
        System.out.println(index7);
        System.out.println(index8);
    }

    // String类的常用方法④
    public void g() {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        // intern字符串池
        /*
        intern()方法返回字符串对象的规范化表示形式
        它遵循以下规则：
        对于任意两个字符串s和t，当且仅当s.equals(t)为true时，s.intern()==t.intern()才为true
        返回值：一个字符串，内容与此字符串相同，但一定取自具有唯一字符串的池
         */
        String str11 = str1.intern();
        String str21 = str2.intern();
        String str31 = str3.intern();
        System.out.println(str1==str2);// true
        System.out.println(str1==str3);// false
        System.out.println(str11==str21);// true
        System.out.println(str11==str31);// true
        // 特别记录
        String strA = "a";
        String strB = "b";
        String strC = "ab";
        String strD = strA+strB;
        String strE = "a"+"b";
        String a = "a".concat("b");
        String strF = new String("ab");
        System.out.println(strD);
        System.out.println(strE);
        System.out.println(strC==strD);// 结果为false
        System.out.println(strC==strE);// 结果为true
        System.out.println(strF.intern()==strC);// 结果为true
        System.out.println(strF.intern()==strD);// 结果为false
        System.out.println(strF.intern()==strE);// 结果为true
        System.out.println(strF.intern()==a);// 结果为false
        System.out.println(strF.intern()==a.intern());// 结果为true
        // 因为用concat()方法拼接时，是使用形式参数进行操作，产生一个新字符串
        /*
        注意：
        1.采用new创建的字符串对象不进入字符串池
        2.字符串相加的时候，都是静态字符串的结果会添加到字符串池，如果其中含有变量，则不会进入字符串池中
        3.字符串一旦进入字符串池中，就会先查找池中有无此对象
            如果有此对象，则让对象引用指向此对象
            如果无此对象，则先创建此对象，再让对象引用指向此对象
        4.定义变量的时候赋值，如果赋值的是静态的字符串，就会执行进入字符串池的操作
            如果池中含有该字符串，则返回引用
         */
    }

    // String类的常用方法⑤
    public void h() {
        String str = "ashdshdjkshdjashd";
        // 截取字符串，从第四个开始截取一个新的字符串
        String str1 = str.substring(3);
        System.out.println(str1);
        // 截取字符串，从第四个开始到第六个结束截取一个新的字符串
        String str2 = str.substring(3,6);// 注意：6这个索引是Java中少有的从1开始数的
        System.out.println(str2);
        // 拼接字符串，将目标字符串和"777"字符串进行拼接产生一个新的字符串
        String str3 = str.concat("777");
        System.out.println(str3);
        String str4 = str + "777";
        System.out.println(str4);
        String str5 = "666".concat("777");// 注意：静态字符串也可以调用该方法
        System.out.println(str5);
    }

    // String类的常用方法⑥
    public void i() {
        String str = "shdfuhdskfhadsjkfdsf";
        boolean b1 = str.startsWith("sh");// 判断字符串是否以"sh"开头
        System.out.println(b1);
        boolean b2 = str.endsWith("sh");// 判断字符串是否以"sh"结尾
        System.out.println(b2);
        String str1 = str.replace("f","F");// 替换目标字符串中的f为F，生成一个新的字符串
        System.out.println(str1);
        char[] chars = str.toCharArray();// 将字符串转换成字符数组
        System.out.println(Arrays.toString(chars));
        byte[] bytes = str.getBytes();// 将字符串转换成字节数组
        System.out.println(Arrays.toString(bytes));
    }

    // String类的常用方法⑦
    public void j() {
        String str = "ahsd%jhs%jdh%sj%kdsd%sd";
        // 按照%将字符串分割成一个字符串数组
        String[] arr = str.split("%");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        //new DemoS().a();
        //new DemoS().b();
        //new DemoS().c();
        //new DemoS().d();
        //new DemoS().e();
        //new DemoS().f();
        //new DemoS().g();
        //new DemoS().h();
        //new DemoS().i();
        //new DemoS().j();
    }
}
