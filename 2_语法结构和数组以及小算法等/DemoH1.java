package pro190525;
// 数组：数组是一个变量，这个变量有多个值存在，通过下标来获取到具体值，下标从0开始，数组定长
public class DemoH1 {
    public static void main(String[] args) {
        // 数组的定义
        /*
        数据类型[] 数组名;// 声明一个数组，无法使用
         */
        /*
        数据类型[] 数组名 = new 数据类型[大小];// 声明并分配空间
        分配完后有默认值
        原始数据类型为0,如int为0、float为0.0、boolean为false、char为ASCII码0——NUL（字符类型）
        引用数据类型为null，如String为null（指针类型）
         */
        String[] e = new String[1];
        System.out.println(e[0]);
        /*
        这两种效果一样，就是写法不同，第一种方便，第二种全写
        数据类型[] 数组名 = {值列表};// 声明、分配空间并赋值操作
        数据类型[] 数组名 = new 数据类型[]{值列表};// 声明，分配空间并赋值操作
         */
        /*
        int[] a;
        int b[];
        []可以写在数组名的前面或者后面，标准规范是写在数组名前面
         */
        // 数组定义后，只能存放定义的类型，或者其兼容的类型，若定义为大类型，则也可存放其子类型
        int[] array = new int[7];// 产生了一个int数组，长度为7，默认值都是0
        // 使用数组——如何赋值、如何获取值、如何获取数组长度
        array[3] = 8;// 将8赋予了数组的第四个元素
        int a = array[1];// 将数组的第二个元素值赋予了变量a
        int len = array.length;// 获取到数组长度
        // 如何通过循环给数组赋值、获取值
        for(int i = 0;i<array.length;i++){
            array[i] = (int)(Math.random()*100+1);
            System.out.println(array[i]);
        }
    }
}
