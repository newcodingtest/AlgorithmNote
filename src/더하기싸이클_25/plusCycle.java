package 더하기싸이클_25;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//더하기 싸이클 구하기
//26 2+6=8 =>68, 6+8=14 =>84, 8+4=12 =>42, 4+2=6 =>26  답:4
//05 0+5=5 =>55, 5+5=10 =>50, 5+0=5 =>05, 답:3
public class plusCycle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int res=n;
        int tmp=0;
        int cnt=0;

        do{
            tmp=res/10 + res%10;
            res=res%10 * 10 + tmp%10;
            cnt++;
        }while(n!=res);

        System.out.println("싸이클은?: "+cnt);


    }
}
