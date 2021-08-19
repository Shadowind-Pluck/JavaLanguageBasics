package pro190525;

import java.util.Arrays;

// 对数组排序——使用冒泡排序法
public class DemoH3 {
    public static void main(String[] args) {
        int len = (int)(Math.random()*5+6);
        int[] score = new int[len];
        for(int i = 0;i<score.length;i++){
            score[i] = (int)(Math.random()*100+1);
        }
        System.out.println(Arrays.toString(score));
        int[] newArray = Arrays.copyOf(score,len-3);
        System.out.println(Arrays.toString(newArray));
        // 可以调用已经写好的方法来进行排序
        Arrays.sort(score);// 按数字升序进行排序
        System.out.println(Arrays.toString(score));
    }
}
