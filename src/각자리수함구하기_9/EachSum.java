package 각자리수함구하기_9;

import java.util.Scanner;

public class EachSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int result=0;

        //ex) 1232 => 123 => 12 => 1
        //      2      3      2    1   =결과:8
        while(x>0){
            result += x % 10;
            x /=10;
        }
        System.out.println("result = " + result);
    }
}
