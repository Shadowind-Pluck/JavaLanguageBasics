package pro190519;
// 这个是单行注释
/*
这个是多行注释
 */

/**
 * 这个是文档注释
 */
// 这个是一个Java类——作用域 类关键字 类名
// 类名和文件名要一致
public class DemoA {
    /*
    这个方法是Java主程序入口，里边的内容缺一不可
     */
    public static void main(String[] args) {
        // 输出一段内容到控制台
        System.out.println("你好，中国");// 输出后换行
        System.out.print("你好，中国");// 输出后不换行
        System.out.println("你好，中国");
        // Java中的转义字符 \
        System.out.println("\"");
        System.out.println("\'");
        System.out.println("\\");
        System.out.println("a\na");
        System.out.println("b\tb");// tab
    }
}
