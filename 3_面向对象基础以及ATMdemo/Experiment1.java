package pro190607;
// 测试数组被隐式构造器初始化后的情况
import java.util.Arrays;

public class Experiment1 {
    public int[] array1;
    public double[] array2;
    public char[] array3;
    public String[] array4;
    public int[] array5 = {1,2,3};

    public static void main(String[] args) {
        Experiment1 e = new Experiment1();
        System.out.println(e.array1);
        System.out.println(e.array2);
        //System.out.println(e.array3);// 报错
        System.out.println(e.array4);
        System.out.println(e.array5);
        System.out.println(Arrays.toString(e.array1));
        System.out.println(Arrays.toString(e.array2));
        System.out.println(Arrays.toString(e.array3));
        System.out.println(Arrays.toString(e.array4));
        System.out.println(Arrays.toString(e.array5));
    }
}
