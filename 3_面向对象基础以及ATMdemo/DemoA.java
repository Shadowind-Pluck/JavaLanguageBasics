package pro190607;

import java.util.Arrays;

// 一个Java文件中只能有一个public修饰的类，并且这个类必须和文件名相同
// 方法部分
public class DemoA {
    // 属性
    // 方法
    /*
    public：公开的，所有人都能访问
    void：无返回结果，调用这个方法不能获取返回值
    methodA：方法名，规范：动词，首字母小写，驼峰
    当前方法无参数
     */
    public void methodA() {
        System.out.println("调用我的方法会输出一段话！");
        System.out.println("你好，中国！");
    }

    /*
    int：返回类型，标明了该方法的返回类型为int，必须在程序体的最后一行进行return，有且只能有一个return
     */
    public int methodB1() {
        System.out.println("我是methodB1方法，调用我能得到一个int类型的结果");
        return 9;
    }
    // 错误示例
    /*public int methodB2() {
        return 8,3;// 返回结果只能有一个，而且必须为int类型
    }*/
    public int methodB3() {
        int i = (int)(Math.random()*10+1);
        System.out.println("i的值："+i);
        if(i>7){
            return 6;// 没有else会报错，因为有可能没有返回值
        }else{
            return 7;
        }
        //return i>7?6:7;// 另一种写法
    }
    public int methodB4() {
        int i = (int)(Math.random()*10+1);
        System.out.println("i的值："+i);
        if(i>7){
            return 5;
        }
        System.out.println("我是methodB4");// 会在i小于等于7时执行
        return 8;
    }
    public int methodB5() {
        for(int i = 0;i<10;i++){
            System.out.println("i："+i);
            if(i==4){
                System.out.println("我是methodB5");
                return 8;// 在循环中加入return等同于break操作
            }
        }
        /*
        从程序上来看，i绝对会等于4，return 11;也一定不会执行
        从语法上来看，这个逻辑不是绝对的，所以循环外必须有返回
        给if语句后加else，其中写上返回以及循环里if外写上返回，也都不行，语法逻辑上有漏洞，有可能连循环都进不去
         */
        return 11;
    }

    // 参数列表问题
    public void methodC1(int a,int b) {// 形式参数列表，重点在于参数类型，个数和顺序（类型顺序）
        System.out.println("接收了用户输入的值，a："+a+",b："+b);// 需要方法的调用者传递2个int类型的参数
    }
    public double methodC2(double a,double b) {
        System.out.println("进行了求和计算");
        return a+b;
    }
    public void methodC3(int[] array) {
        /*for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }*/
        System.out.println("接收时，接收的是一个数组："+Arrays.toString(array));
    }
    /*
    ...的意思是省略号，不知道需要传递几个参数，可以是（注意：可以不传参数）0个、1个、2个，或者更多，但必须是int类型
    接收后，是以数组形式使用
    实际上，methodC3和methodC4对于方法的拥有者是一样的，但是对于方法的调用者不一样
    使用methodC3时，需要把参数封装成一个数组传过来，但methodC4只需要传一个接一个的参数就可以
    methodC4会自动把参数封装成一个数组
     */
    public void methodC4(int...array) {
        System.out.println("接收时，接收的是一个数组："+ Arrays.toString(array));
    }
}

// 举例1
class DemoA2 {

}

// 举例2
class DemoA3 {

}
