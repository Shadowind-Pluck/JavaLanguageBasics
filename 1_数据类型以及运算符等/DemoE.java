package pro190519;

public class DemoE {
    // 二元运算
    /*
    +=
    -=
    *=
    /=
    %=
     */
    public static void main(String[] args) {
        int a,b;
        // 随机数 Math.random() 取值范围为[0,1)
        a = (int)(Math.random()*10+1);
        b = (int)(Math.random()*10+1);
        System.out.println(a+"\t"+b);// 此处加号起的是拼接作用
        a+=b;// a = a+b;
        System.out.println(a);
        a-=b;// a = a-b;
        System.out.println(a);
        a*=b;// a = a*b;
        System.out.println(a);
        a/=b;// a = a/b;
        System.out.println(a);
        a%=b;// a = a%b;
        System.out.println(a);
    }
}
