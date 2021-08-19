package pro190525;
// 多重if分支
/*
if(条件1){
    操作1;
}else if(条件2){
    操作2;
}else if(条件3){
    操作3;
}......
[else{
    操作n;
}]
注意：[]里面的内容代表可省略
 */
public class DemoD {
    public static void main(String[] args) {
        /*
        小明参加考试：
        成绩大于等于80分，输出A
        成绩大于等于70分，输出B
        成绩大于等于60分，输出C
        其他成绩，输出D
         */
        int score = (int)(Math.random()*100+1);
        System.out.println("成绩是："+score);
        // Java的if语句中，当只有一条语句时也可以省略{}，但是不希望省略，要标准化
        if(score>=80){
            System.out.println("A");
        }else if(score>=70){
            System.out.println("B");
        }else if(score>=60){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
}
