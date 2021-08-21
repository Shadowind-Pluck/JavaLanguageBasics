package pro190922;

import java.io.File;
import java.util.Arrays;

// File类：表示系统中文件或者文件夹（目录）
// 注意：路径分隔符可以为 '/' '//' '\\'，不能为'\'
public class DemoA {
    public void a() {// 如何代表相应的文件和文件夹
        // 注意：有后缀的代表文件，没后缀的代表目录
        // 代表E盘下的a文件夹下的b文件夹
        File file1 = new File("E://a//b");
        File file2 = new File("E://a","b");
        // 代表E盘下的a文件夹下的a.txt文件
        File file3 = new File("E://a//a.txt");
        File file4 = new File("E://a","a.txt");
    }

    public void b() {
        File file1 = new File("E://a//b.txt");
        File file2 = new File("E://b//a");// 注意：没有如果没有父目录的情况
        // 创建文件或者文件夹
        try{
            //file1.createNewFile();// 创建文件
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //file2.mkdir();// 创建文件夹，要求父目录存在（否则创建没有成功）
        file2.mkdirs();// 创建文件夹，父目录可以不存在，会自动创建不存在的父目录
    }

    public void c() {
        File file1 = new File("E://a//b.txt");
        File file2 = new File("E://b//a");
        // delete()方法可以删除文件或者文件夹
        file1.delete();
        file2.delete();
    }

    public void d() {
        File file1 = new File("E://a//b.txt");
        File file2 = new File("E://b//a");
        boolean b1 = file1.isAbsolute();// 判断一个文件类对象的路径是否为绝对路径
        boolean b2 = file1.isDirectory();// 是否是目录
        boolean b3 = file2.isFile();// 是否是文件
        boolean b4 = file2.isHidden();// 检查文件是否隐藏
        boolean b5 = file2.exists();// 是否存在
        String fileName = file1.getName();// 获取文件夹名或者文件名（带后缀）
        String path = file2.getAbsolutePath();// 获取完整路径（绝对路径）
        String parentFileName = file2.getParent();// 获取父目录名称

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(fileName);
        System.out.println(path);
        System.out.println(parentFileName);
    }

    public void e() {
        File file = new File("E://a");
        File parentFile = file.getParentFile();// 获取父目录
        // 注意：只有目录才有子目录或者子文件
        File[] childFiles = file.listFiles();// 获取到所有的子目录（数组形式）

        System.out.println(parentFile);
        System.out.println(Arrays.toString(childFiles));
    }

    public static void main(String[] args) {
        //new DemoA().a();
        //new DemoA().b();
        //new DemoA().c();
        //new DemoA().d();
        //new DemoA().e();
    }
}
