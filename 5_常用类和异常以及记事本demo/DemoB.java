package pro190908;
// 常用类——字符串类——StringBuffer类
// StringBuffer类是一个可变字符串（序列）
public class DemoB {
    public static void a() {
        /*
        注意：这样声明是错误的 StringBuffer str1 = "abc";
        StringBuffer和String不是一种类型
        StringBuffer只能new对象
         */
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer("abc");
    }

    public static void b() {
        StringBuffer str = new StringBuffer("abc");
        System.out.println(str);
        str.append("aaa");// 追加aaa到字符串尾部
        System.out.println(str);
        str.insert(1,"sss");// 插入sss到字符串的第二个位置
        System.out.println(str);
        str.delete(3,5);// 从第四个到第五个被删除
        System.out.println(str);
        str.reverse();// 反转字符串
        System.out.println(str);
        String s = str.toString();// StringBuffer——>String
        System.out.println(s);
    }

    public static void main(String[] args) {
        b();
    }
}
/*
String
StringBuffer
StringBuilder
 */
