package 소수판별기_7;

import java.util.Scanner;

public class Sosu {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x =sc.nextInt();

        int cnt=0;
        for(int i=1; i<=x; i++){
            if(x%i==0){
                cnt++;
            }
        }
        if(cnt>2){
            System.out.println(" 해당 숫자는 소수가 아닙니다.");
            System.out.println("cnt = " + cnt);
        }else{
            System.out.println(" 해당 숫자는 소수입니다.");
        }
    }
}
