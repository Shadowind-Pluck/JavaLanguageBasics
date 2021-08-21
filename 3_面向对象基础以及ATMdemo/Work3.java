package pro190607;

import java.util.Scanner;

// 计算器
public class Work3 {
    public int a,b;
    public String type;
    private Scanner sc = new Scanner(System.in);// 定义为私有的，防止影响别的代码

    public void scanf() {// 输入
        System.out.print("请输入两个数：");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("请输入操作符：");
        type = sc.next();
        switch(type){
            case "+":
                summation(a,b);
                break;
            case "-":
                difference(a,b);
                break;
            case "*":
                quadrature(a,b);
                break;
            case "/":
                divide(a,b);
                break;
            case "%":
                remainder(a,b);
                break;
            default:
                System.out.println("请输入正确的符号！");
        }
    }
    public void summation(int a,int b) {// 求和
        System.out.println(a+"+"+b+"="+(a+b));
    }
    public void difference(int a,int b) {// 求差
        System.out.println(a+"-"+b+"="+(a-b));
    }
    public void quadrature(int a,int b) {// 求积
        System.out.println(a+"*"+b+"="+(a*b));
    }
    public void divide(int a,int b) {// 求商
        System.out.println(a+"/"+b+"="+(a/b));
    }
    public void remainder(int a,int b) {// 求余
        System.out.println(a+"%"+b+"="+(a%b));
    }

    public static void main(String[] args) {
        Work3 w3 = new Work3();
        w3.scanf();
    }
}
