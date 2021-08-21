package pro190922;

import java.io.*;
import java.util.Arrays;

// IO流：InputOutputStream（输入输出流）传输
/*
在Java中Input是读取，Output是写入
输入输出都是针对内存，
    Input，输入到内存，也就是从其他数据源读取数据，然后输入到内存，显然这就是读文件到内存
    Output，从内存输出，也就是把内存中的数据写入到其他地方
 */
public class DemoB {
    public void a() {
        try{
            File file = new File("E://a//a.txt");
            // 从file到Java的过程，修了一个从file到Java的路，也可以说是建立了连接（单行线）
            InputStream in = new FileInputStream(file);// 会抛出一个文件未找到异常
            byte[] bytes = new byte[10];
            /*
            这里是读取一次的代码

            // 将读出的内容写入到bytes数组中，并返回实际读取到内容的字节数，读取内容最多为数组的大小
            // 将一次读取的内容存入bytes数组，len是实际长度
            int len = in.read(bytes);// 注意：文件必须保存才可以读取到
            System.out.println("实际读取长度："+len);
            // 注意：若不写后面两个参数，字符串长度为原数组长度，不过输出不会显示，因为为null
            String str = new String(bytes,0,len);// 从下标0开始读取，读取len长度
            System.out.println(str.length());
            System.out.println("实际读取内容："+str);
            System.out.println(Arrays.toString(bytes));
             */
            int len;
            // 自我理解：InputStream就是一个流，不断的读取，所以可以循环接收
            /*
            注意：
                源代码中无参数的read方法，这时read返回的是字符对应的整数，如果已到达流的末尾，则返回-1
             */
            while((len = in.read(bytes))!=-1){
                String str = new String(bytes,0,len);
                System.out.println(str);
            }
            in.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void b() {
        try{
            File file = new File("E://a//a.txt");
            OutputStream out = new FileOutputStream(file);
            String str1 = "你好，中国！";// 注意：第一次写入，会清空文件里原来的内容
            byte[] bytes1 = str1.getBytes();// getBytes()的重载方法有参数，是charsetName（字符集名称）
            out.write(bytes1);
            String str2 = "Hello,World!";// 一次执行多次写入，不会清空之前写入的内容
            byte[] bytes2 = str2.getBytes();
            out.write(bytes2);
            out.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        //new DemoB().a();
        //new DemoB().b();
    }
}
