package 더하기빼기패턴_30;

import java.util.Arrays;
import java.util.Scanner;
/*
 입력된 숫자까지 + - 를 차례대로 반복하시오
예제 입력: 9
출력 1+2-3+4-5+6-7+8-9
* */
public class plus_minus_pattern {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String[] arr=new String[sc.nextInt()];
        int cnt=1;
        for (int i = 0; i <arr.length ; i++) {

            if(cnt==arr.length){
                arr[i]=cnt+" ";
            }
            else if(cnt%2==1){
                arr[i]=cnt+"+";
            }else {
                arr[i]=cnt+"-";


            }
            cnt++;

        }

        for (String str:arr){
            System.out.print(str);
        }

    }
}
