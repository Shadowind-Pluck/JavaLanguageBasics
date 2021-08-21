package pro190908;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.*;

public class 记事本 extends JFrame {
    // 注意：养成良好的习惯，尽量别在成员变量声明时赋值，需要时在专门的区域进行操作
    private TextArea area;// 多行文本域
    private JScrollPane jsp;// 带滚动条的面板
    private MenuBar bar;// 菜单栏
    private Menu m1,m2,m3,m4,m5;// 菜单
    private MenuItem mi11,mi12,mi13,mi14,mi15,mi16,mi17;// 菜单子选项

    public 记事本() {// 构造器
        setTitle("新建文本文档——记事本");

        // 该区域负责对控件进行初始化操作
        area = new TextArea();
        jsp = new JScrollPane(area);// 将多行文本域放入面板
        bar = new MenuBar();
        // 注意：书写中文时有可能会发生乱码，因为使用的中文编码表不同（记事本——GBK、IDEA——UTF-8）
        m1 = new Menu("File");
        m2 = new Menu("Edit");
        m3 = new Menu("Format");
        m4 = new Menu("View");
        m5 = new Menu("Help");
        mi11 = new MenuItem("New");
        mi12 = new MenuItem("Open");
        mi13 = new MenuItem("Save");
        mi14 = new MenuItem("Save As");
        mi15 = new MenuItem("Settings");
        mi16 = new MenuItem("Print");
        mi17 = new MenuItem("Exit");

        bar.add(m1);
        bar.add(m2);
        bar.add(m3);
        bar.add(m4);
        bar.add(m5);
        m1.add(mi11);
        m1.add(mi12);
        m1.add(mi13);
        m1.add(mi14);
        m1.addSeparator();// 加入分隔符
        m1.add(mi15);
        m1.add(mi16);
        m1.addSeparator();
        m1.add(mi17);

        // 该区域负责设置快捷键
        mi11.setShortcut(new MenuShortcut(KeyEvent.VK_N));// VK_N 是一个int类型的常量（键盘的编码）

        add(jsp);// 将面板放入到窗体中
        setMenuBar(bar);// 设置当前窗体的菜单栏

        mi12.addActionListener(new OpenFile(this));
        mi14.addActionListener(new SaveAsFile(this));

        // 设置textArea的字体
        Font font = new Font("宋体",Font.BOLD,24);
        area.setFont(font);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 点击×时释放内存（否则点击×不会结束程序）
        setBounds(0,0,700,450);// 设置窗体位置和尺寸
        setLocationRelativeTo(null);// 居中显示（必须书写在设置窗体位置和尺寸的语句后，否则显示错误）
        setVisible(true);// 显示窗体
    }

    class OpenFile implements ActionListener {// 内部类
        private 记事本 textNode;

        public OpenFile(记事本 textNode) {
            this.textNode = textNode;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            FileDialog fd = new FileDialog(textNode,"目标文件",FileDialog.LOAD);
            fd.setVisible(true);
            String directory = fd.getDirectory();// 读取文件的路径
            String file = fd.getFile();// 读取文件的名称（包括后缀名）
            String path = directory+file;
            String str = 记事本.读取(path);
            area.setText(str);// 将读取到的字符串，显示在多行文本域中
        }
    }

    class SaveAsFile implements ActionListener {// 内部类
        private 记事本 textNode;

        public SaveAsFile(记事本 textNode) {
            this.textNode = textNode;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            FileDialog fd = new FileDialog(textNode,"另存为",FileDialog.SAVE);
            fd.setVisible(true);
            String directory = fd.getDirectory();
            String file = fd.getFile();
            String path = directory+file;
            String str = area.getText();
            记事本.写入(str,path);
        }
    }

    private static String 读取(String path) {// 静态方法，可以直接调用
        String str = "";
        File file = new File(path);
        try{
            Reader reader = new FileReader(file);
            char[] chars = new char[10];
            int len;
            while((len = reader.read(chars))!=-1){
                str+=new String(chars,0,len);
            }
            reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return str;
    }

    private static void 写入(String str,String path) {// 静态方法，可以直接调用
        File file = new File(path);
        try{
            Writer writer = new FileWriter(file);
            // Windows中换行是\r\n
            str = str.replace("\n","\r\n");// 将文本内容中的'\n'，替换为'\r\n'
            writer.write(str);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new 记事本();
    }
}
/*
新建：
1.未更改，直接新建
2.已打开，已更改，新建时提示保存
3.已打开，已保存，直接新建

保存：
1.曾经保存过，直接保存
2.未保存过，保存时提示存放位置

“业务”
 */
