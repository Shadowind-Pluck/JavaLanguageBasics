package pro190607;

import java.util.Scanner;

public class Experiment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i){
            case 1:
                System.out.println(1);
                break;
            // 注意：如果未把default书写在switch语句最后，必须要在default里加上break语句
            default:
                System.out.println(3);
                break;
            case 2:
                System.out.println(2);
                break;
        }
    }
}
