package pro190607;

import java.util.Scanner;

/*
ATM系统
1.输入密码进入系统
2.能够进行取款、存款、改密、查询和退出操作
 */
public class Work4 {
    public String pass = "123456";// 有个bug，密码可以是字符，不过ATM机上本来就不能输入字符
    public int money;
    public Scanner sc = new Scanner(System.in);

    public boolean logIn() {
        System.out.print("请输入密码：");
        String pass = sc.next();
        if(this.pass.equals(pass)){
            System.out.println("登陆成功！");
            return true;
        }else{
            System.out.println("密码错误！");
            return false;
        }
    }
    public void ATM() {
        System.out.println("操作提示：取款、存款、改密、查询、退出");
        System.out.print("请输入操作：");
        String operation = sc.next();// 操作
        /*
        case语句中一般要有break语句，除非处理特殊问题
        建议default语句写在最后或者加上break！
        注意：当程序执行一条case语句后，程序体结尾没有break，则会继续执行紧接其后的语句
         */
        switch(operation){
            case "取款":
                withdrawals();
                print();
                ATM();
                break;
            case "存款":
                deposit();
                print();
                ATM();
                break;
            case "改密":
                changePass();
                if(!logIn()){
                    break;// 如果执行此处的break语句，会直接跳出，不执行ATM()语句
                }
                ATM();
                break;
            case "查询":
                inquire();
                ATM();
                break;
            case "退出":
                /*
                参数为0时，正常退出当前程序，关闭虚拟机（JVM）
                参数为其他值时，非正常退出当前程序，关闭虚拟机（JVM）
                 */
                //System.exit(0);
                break;
            default:
                System.out.println("输入操作错误！");
                ATM();
        }
    }
    public void withdrawals() {// 取款
        System.out.print("请输入取款金额：");
        int money = sc.nextInt();
        if(this.money<money){
            System.out.println("金额不够！");
        }else{
            this.money-=money;
        }
    }
    public void deposit() {// 存款
        System.out.print("请输入存款金额：");
        int money = sc.nextInt();
        this.money+=money;
    }
    public void changePass() {// 改密
        System.out.print("请输入新密码：");
        String pass = sc.next();
        if(this.pass.length()==pass.length()){
            this.pass = pass;
        }else{
            System.out.println("密码格式错误,请再次输入！");
            changePass();
        }
    }
    public void inquire() {// 查询
        print();
    }
    public void print() {
        System.out.println("剩余金额："+money);
    }

    public static void main(String[] args) {
        Work4 w4 = new Work4();
        if(w4.logIn()){
            w4.ATM();
        }
    }
}
