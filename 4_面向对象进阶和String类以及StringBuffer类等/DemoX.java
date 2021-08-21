package pro190630;
// StringBuffer：线程安全的可变字符序列
public class DemoX {
    // 如何产生StringBuffer
    public void a() {
        // 产生一个空字符序列
        StringBuffer str1 = new StringBuffer();
        // 按照字符串"abc"为模板产生一个新字符串
        StringBuffer str2 = new StringBuffer("abc");
        System.out.println(str1);
        System.out.println(str2);
    }

    // StringBuffer的常见方法
    public void b() {
        StringBuffer str = new StringBuffer("abc");
        // 将aa字符串追加到目标字符串的结尾
        str.append("aa");
        System.out.println(str);
        str.append('c');// 可以添加字符
        System.out.println(str);
        // 将bb字符串插入到指定位置之前（将bb插入到第四个字符之前）
        str.insert(3,"bb");
        System.out.println(str);
        str.insert(3,'c');// 可以插入字符
        System.out.println(str);
        // 将目标字符串中第四个到第五个字符删除掉
        str.delete(3,5);// 注意：5这个索引是Java中少有的从1开始数的（学习了两个：substring()、delete()）
        System.out.println(str);
        // 将StringBuffer类型转换为String类型
        String str1 = str.toString();// 这里的toString()方法被重写过
        System.out.println(str1);
        // 反转字符串
        str.reverse();
        System.out.println(str);
        // 删除第五个字符
        str.deleteCharAt(4);
        System.out.println(str);
    }

    public static void main(String[] args) {
        //new DemoX().a();
        //new DemoX().b();
    }
}
/*
String：不可变的字符串（String是绝对线程安全的）
StringBuffer：线程安全的可变字符串
StringBuilder：线程不安全的可变字符串
 */
