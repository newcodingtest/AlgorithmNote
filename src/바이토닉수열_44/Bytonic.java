package 바이토닉수열_44;

import java.util.Scanner;
/*
바이토닉 수열이면서 가장 긴 수열의 길이를 구하시오

입력:
10
1  5  2  1  4  3  4  5  2  1
출력:7

바이토닉 수열
증가하는 부분 + 감소하는 부분이 동시에 존재

          1  2  3  4  5  6  7  8  9  10
          1  5  2  1  4  3  4  5  2  1
    증가-> 1  2  2  1  3  3  4  5  2  1
    김소<- 1  3  2  1  4  3  3  3  2  1
    합    2  5  4  2  7  6  7  8  4  2    ->8이 답인데 오른쪽 왼쪽 증가수열 계산했으니까 숫자 2번중복됫으니 -1해줌으로 중복제거 결국7이 답이다.
  */
public class Bytonic {
    public static int getMax(int a, int b){
        if(a>b) return a;
        else return b;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] input=new int[1001];
        int[] plus=new int[1001];
        int[] minus=new int[1001];

        int n= sc.nextInt();

        for (int i = 0; i <n ; i++) {
            int m=sc.nextInt();
            input[i]=m;
        }

        //수열 1값으로 초기화
        for (int i = 0; i <n ; i++) {
                plus[i]=1;
                minus[i]=1;
        }
        //->수열
        for (int i = 1; i <n ; i++) {
            for (int j = i; j >=0 ; j--) {
                    if(input[j]<input[i]){
                        plus[i]=getMax(plus[i],plus[j]+1);
                    }
            }
        }
        //<-수열
        for (int i = n-1; i >=0 ; i--) {
            for (int j = i; j <n ; j++) {
                if(input[j]<input[i]){
                    minus[i]=getMax(minus[i],minus[j]+1);
                }
            }
        }
        int max=0;
        for (int i = 0; i <n ; i++) {
            if (max<plus[i]+minus[i]){
                max=plus[i]+minus[i];
            }

        }

        for (int i = 0; i <n ; i++) {

            System.out.print(plus[i]);
        }

        System.out.println("바이토닉수열 최대값은: "+(max-1));


    }
}
