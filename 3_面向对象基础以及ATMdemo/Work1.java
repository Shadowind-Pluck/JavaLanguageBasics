package pro190607;

import java.util.Scanner;

// 方法递归
public class Work1 {
    // 实现循环输出1-10
    public void a(int i) {
        System.out.println(i);
        i++;
        if(i<11){
            a(i);// 注意：自己调用自己，不需要产生自己的对象
        }
    }
    // 通过递归实现1-100之和
    public void b1(int i,int sum) {
        sum+=i;
        i++;
        if(i<101){
            b1(i,sum);
        }else{
            System.out.println("1-100之和："+sum);
        }
        /*
        注意：输出语句必须写在else里，不能写在if语句后（此位置），不然每次都会输出
        输出是反着的，递归一层一层进去，计算完成后先输出最后计算的值（5050）
        然后逐次输出递减的值，也就是倒数第二次的值、倒数第三次的值等等，直到结束
         */
    }
    // 定义了一个成员变量
    int sum;// 将sum定义为成员变量，不需要初始化，默认值为0
    public void b2(int i) {
        sum+=i;
        i++;
        if(i<101){
            b2(i);
        }else{
            System.out.println("1-100之和："+sum);
        }
    }

    /*
    用户输入密码，进行比对，如果正确，提示通过，如果错误，提示错误
    继续进行密码输入，连续错误3次退出
     */
    // 注意：当把Scanner定义在方法外时，所有方法都可以使用输入对象（无论位置），除了静态方法（如主方法）
    Scanner sc = new Scanner(System.in);// 当在方法外使用输入对象时，必须让其给变量赋值（方法内没做要求）
    /*
    很好理解，方法外使用输入对象时如果没有赋值操作，则其是无意义的
     */
    int pass = 123456;// 初始密码
    int errorNum;// 不需要初始化，默认值为0
    public void checkPass() {
        System.out.print("请输入密码：");
        int pass = sc.nextInt();// 局部变量，输入的密码
        if(this.pass==pass){
            System.out.println("登陆成功！");
        }else if(errorNum<2){
            errorNum++;
            System.out.println("密码错误！还可以错误"+(3-errorNum)+"次！");
            checkPass();// 重新登陆
        }else{
            System.out.println("错误次数已够！");
        }
        // 这里的写法多种多样，发散思维，老师写了个if-else语句套if-else语句，略显麻烦，不做演示
    }

    public static void main(String[] args) {
        Work1 w1 = new Work1();
        //w1.a(1);
        //w1.b1(1,0);
        //w1.b2(1);
        w1.checkPass();
    }
}
