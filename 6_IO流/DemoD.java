package pro190922;

import java.io.*;
import java.util.Arrays;

// 字符流：就是在字节流的基础上封装的效果
public class DemoD {
    public void a() {
        try{
            File file = new File("E://a//a.txt");
            Reader reader = new FileReader(file);
            char[] chars = new char[10];
            int len = reader.read(chars);
            System.out.println(Arrays.toString(chars));
            String str = new String(chars,0,len);
            System.out.println(str);
            reader.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void b() {
        try{
            File file = new File("E://a//a.txt");
            Writer writer = new FileWriter(file);
            writer.write("aaaaaaaaa\r\nbbbbbbb");
            writer.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void c() {
        try{
            File file1 = new File("E://a//a.txt");
            File file2 = new File("E://b//a.txt");
            Reader reader = new FileReader(file1);
            /*
            如果 append 参数为 true，则将字符写入文件末尾处，相当于追加信息
            如果 append 参数为 false，则写入文件开始处，默认为false
             */
            Writer writer = new FileWriter(file2,true);// 这个是追加写法
            char[] chars = new char[10];
            int len;
            /*
            这样书写会发生复制错误！
            while((len = reader.read(chars))!=-1){
                writer.write(chars);
            }
            注意：复制结果不一样，最后多了一个a，很好理解
                    最后一次读取时没有将数组中上一次的字符a覆盖（数组不会自动清空上一次复制的内容），导致复制时发生这样的情况
                    Windows中换行是 \r\n 两个字符
             */
            String str = "";
            while((len = reader.read(chars))!=-1){
                /*
                将数组的内容每次以字符串的形式进行记录，就不会出现上面的情况了
                 */
                str+=new String(chars,0,len);
            }
            writer.write(str);
            reader.close();
            writer.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        //new DemoD().a();
        //new DemoD().b();
        //new DemoD().c();
    }
}
/*
字节：论大小，一个字节8bit，一个汉字两到三个字节
字符：论个数，一个一个数，不管是汉字还是字母、数字都是一个字符
 */
