package pro190607;

import java.util.Arrays;

// 数组扩容问题
public class Work2 {
    // 数组在定义或者使用的时候，如果下标越界，会报异常
    public String[] array;
    public int size;

    public Work2() {
        array = new String[0];
    }
    public Work2(int len) {
        array = new String[len];
    }

    public void add(String str) {
        // 判断数组的长度和实际容量问题
        // 此代码写的不好，需要改善
        /*if(size<array.length){
            array[size] = str;
            size++;
        }else{
            String[] array = Arrays.copyOf(this.array,this.array.length+1);
            this.array = array;
            this.array[size] = str;
            size++;
        }*/
        if(size==array.length){
            // 扩容
            // 产生一个新数组，新数组长度为原数组长度加3
            // 新的数组长度也可以是size+3，此时原数组长度与size相等
            String[] array = Arrays.copyOf(this.array,this.array.length+3);// 一次让它多扩容几个，提高效率
            // 让新数组把原数组覆盖，也就是让原数组指向新数组
            this.array = array;
        }
        array[size] = str;// 这里不需要给array前加this.，因为新数组array在if语句结束后就释放了
        size++;
    }
    public void print() {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Work2 w2 = new Work2(3);
        w2.add("陕西");
        w2.add("湖北");
        w2.add("黑龙江");
        w2.add("北京");
        w2.add("天津");
        w2.add("浙江");
        w2.add("广东");
        w2.print();
    }
}
