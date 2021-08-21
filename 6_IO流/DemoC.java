package pro190922;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class DemoC extends JFrame {
    private JLabel l1,l2;
    private JTextField jtf1,jtf2;
    private JButton b1,b2,b3;

    public DemoC() {
        setLayout(null);// 自定义布局

        // 赋值区域
        l1 = new JLabel("源文件：");
        l2 = new JLabel("目标文件：");
        jtf1 = new JTextField();
        jtf2 = new JTextField();
        b1 = new JButton("选择源文件");
        b2 = new JButton("选择目标文件");
        b3 = new JButton("复制");

        // 设置位置区域
        l1.setBounds(30,40,80,20);
        l2.setBounds(30,80,80,20);
        jtf1.setBounds(120,40,180,20);
        jtf2.setBounds(120,80,180,20);
        b1.setBounds(310,40,120,20);
        b2.setBounds(310,80,120,20);
        b3.setBounds(160,120,90,20);

        // 添加区域
        add(l1);add(l2);
        add(jtf1);add(jtf2);
        add(b1);add(b2);add(b3);

        // 注册事件（绑定事件）
        b1.addActionListener(new B1Button(this));// 构造器起作用，将当前对象传给B1Button
        b2.addActionListener(new B2Button(this));
        b3.addActionListener(new B3Button());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,480,220);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DemoC();
    }

    // 内部类
    class B1Button implements ActionListener {
        private DemoC dc;
        public B1Button(DemoC dc) {// 构造器，将父窗体对象传过来
            this.dc = dc;
        }
        // 在鼠标单击时自动执行
        @Override
        public void actionPerformed(ActionEvent e) {// 此方法是写死的，无法使用参数传递父窗体对象
            /*
            父窗体：当子窗体未关闭时，无法操作父窗体
            标题：字符串
            类型有两种：保存窗体、打开窗体
             */
            // FileDialog fd = new FileDialog(父窗体,标题,类型);
            FileDialog fd = new FileDialog(dc,"选择源文件",FileDialog.LOAD);// 窗体默认不显示
            fd.setVisible(true);
            String directory = fd.getDirectory();// 获取文件夹名称
            String file = fd.getFile();// 获取文件名称
            String path = directory + file;// 路径
            jtf1.setText(path);
        }
    }

    class B2Button implements ActionListener {
        private DemoC dc;
        public B2Button(DemoC dc) {
            this.dc = dc;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            FileDialog fd = new FileDialog(dc,"选择目标文件",FileDialog.LOAD);
            fd.setVisible(true);
            String directory = fd.getDirectory();
            jtf2.setText(directory);
        }
    }

    class B3Button implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String path1 = jtf1.getText();
            String path2 = jtf2.getText();
            File file1 = new File(path1);// 想要复制的文件
            //File file2 = new File(path2);// 复制的目录
            File file3 = new File(path2,file1.getName());// 复制的目录，包含file1的同名称同类型文件

            try{
                InputStream in = new FileInputStream(file1);
                OutputStream out = new FileOutputStream(file3);
                byte[] bytes = new byte[100];
                int len;
                while((len = in.read(bytes))!=-1){
                    out.write(bytes);
                }
                out.close();
                in.close();
            }catch (Exception e1){
                System.out.println(e1.getMessage());
            }
        }
    }
}
// 缺点：没有复制进度显示以及复制是否成功显示
/*
问题：A类中有a方法，B类中有b方法
        如何做到a方法调用了b方法，在b方法中获取到A类的对象?
A类
public void a() {
    B b = new B();
    b.b(this);// 使用 this 获取当前类的对象
}
B类
public void b(A a) { }
 */
