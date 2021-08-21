package pro190922;

import java.io.FileReader;
import java.io.IOException;

/*
通过字符数组进行读取
 */
public class Test {
    public static void a() throws IOException {
        // 定义一个字符数组，用于存储读到的字符
        // 该read(char[])返回的是读到字符的个数
        FileReader fr = new FileReader("E://a//test.txt");
        char[] buf = new char[3];
        int num1 = fr.read(buf);// num1是读取字符的个数
        System.out.println("num1="+num1+"......"+new String(buf));// buf里面才是数据内容
        int num2 = fr.read(buf);// num2是读取字符的个数
        System.out.println("num2="+num2+"......"+new String(buf));// buf里面才是数据内容
        int num3 = fr.read(buf);// num3是读取字符的个数
        System.out.println("num3="+num3+"......"+new String(buf));// buf里面才是数据内容
        // 实验，所有内容都读取完成后，继续读取会发生什么
        int num4 = fr.read(buf);// num4值为-1，意味着读取完成后read()方法返回值是-1
        System.out.println("num4="+num4+"......"+new String(buf));// buf里面才是数据内容
        fr.close();
        /*
        问题：为什么输出的是 num3=1......gef，而不是 num3=1......g
            因为，当读取到g后没有再读取到内容，所以数组的后两个元素没有被覆盖，依然是ef
            如num4的结果，数组内容没有变，返回值为-1
         */
    }

    public static void b() throws IOException {
        // 定义一个字符数组，用于存储读到的字符
        // 该read(char[])返回的是读到字符的个数
        FileReader fr = new FileReader("E://a//test.txt");
        char[] buf = new char[3];
        int num;
        while((num = fr.read(buf))!=-1){
            System.out.print(new String(buf,0,num));// 打印从0到第num个的字符，也恰好是文本中有数据的部分
        }
        fr.close();
    }

    public static void main(String[] args) throws IOException {
        //a();
        //b();
    }
}
