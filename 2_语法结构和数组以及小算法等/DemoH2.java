package pro190525;

import java.util.Arrays;

public class DemoH2 {
    // 有一个成绩数组：每个人成绩都是随机数，统计全班成绩之和以及平均成绩（avg）
    public static void main(String[] args) {
        int len = (int)(Math.random()*5+28);// 随机数在28到32之间
        System.out.println("学生人数为："+len);
        int[] score = new int[len];
        int sum = 0;
        for(int i = 0;i<score.length;i++){
            score[i] = (int)(Math.random()*100+1);
            sum+=score[i];
        }
        System.out.println(len+"个人的总成绩："+sum+"，平均成绩："+(float)sum/len);
        // 求出最高成绩和最低成绩
        int max = score[0],min = score[0];
        for(int i = 1;i<score.length;i++){
            min = min>score[i]?score[i]:min;
            max = max<score[i]?score[i]:max;
        }
        System.out.println("最小值："+min+"\t最大值："+max);
        System.out.println(Arrays.toString(score));
    }
}
