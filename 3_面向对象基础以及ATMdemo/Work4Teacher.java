package pro190607;

import java.util.Scanner;

/*
ATM系统
1.输入密码进入系统
2.能够进行取款、存款、改密、查询和退出操作
 */
public class Work4Teacher {
    public Scanner sc = new Scanner(System.in);
    public int pass = 123456;
    public int money = (int)(Math.random()*100000+101);
    public int errorNum;

    public void inputPass() {// 输入密码
        System.out.print("请输入密码：");
        int pass = sc.nextInt();
        if(this.pass==pass){
            mainInterface();
        }else{
            errorNum++;
            if(errorNum==3){
                System.out.println("吞卡，请联系银行人员！");
            }else{
                System.out.println("密码输入错误，请重新输入！");
                inputPass();
            }
        }
    }
    public void mainInterface() {// 主界面
        System.out.println("****************************************");
        System.out.println("**********欢迎访问中国XX银行ATM*************");
        System.out.println("****************************************");
        System.out.println("1.存款");
        System.out.println("2.取款");
        System.out.println("3.查询");
        System.out.println("4.改密");
        System.out.println("5.退出");
        System.out.print("请选择操作：");
        int type = sc.nextInt();
        if(type==1){
            deposit();
        }else if(type==2){
            withdrawals();
        }else if(type==3){
            inquire();
        }else if(type==4){
            changePass();
        }else if(type==5){
            quit();
        }else{
            System.out.println("请输入正确操作！");
            mainInterface();
        }
    }
    public void deposit() {// 存款
        System.out.print("请放入钞票：");
        int money = sc.nextInt();
        if(money>10000){
            System.out.println("最多只能放入100张钞票，请重新放入钞票！");
            deposit();
        }else{
            if(money%100!=0){
                System.out.println("请放入100元面值钞票！");
                deposit();
            }else{
                this.money+=money;
                System.out.println("存款成功！成功存入："+money+"元！");
                mainInterface();
            }
        }
    }
    public void withdrawals() {// 取款
        System.out.print("请输入取款金额：");
        int money = sc.nextInt();
        if(this.money<money){
            System.out.println("你的余额不足！");
            withdrawals();
        }else{
            if(money%100!=0){
                System.out.println("只支持100元面值的钞票！");
                withdrawals();
            }else{
                this.money-=money;
                System.out.println("取款成功！成功取出："+money+"元！");
                mainInterface();
            }
        }
    }
    public void inquire() {// 查询
        System.out.println("你的余额为："+money+"元！");
        mainInterface();
    }
    public void changePass() {// 改密
        System.out.print("请输入原密码：");
        int pass = sc.nextInt();
        if(this.pass!=pass){
            System.out.println("原密码错误！");
            changePass();
        }else{
            System.out.print("请输入新密码：");
            int newPass1 = sc.nextInt();
            System.out.print("请再次输入新密码：");
            int newPass2 = sc.nextInt();
            if(newPass1==newPass2){
                this.pass = newPass1;
                System.out.println("改密成功！");
                inputPass();
            }else{
                System.out.println("两次密码输入不一致！");
                changePass();
            }
        }
    }
    public void quit() {//退出
        System.out.println("欢迎下次使用！");
    }

    public static void main(String[] args) {
        Work4Teacher w4t = new Work4Teacher();
        w4t.inputPass();
    }
}
