package 더하기123재귀_39;


import java.util.Scanner;

//정수 4 를 1,2,3의 합으로 나타내는 방법은 총 7가지가 있다.
/*
1+1+1+1

1+1+2
1+2+1

2+1+1
2+2
1+3
3+1

정수 n이 주어졌을 때 n을 1,2,3의 합으로 나타내는 방법의 수를 구하는 프로구램을 작성하시오
입력:
4
7
10
출력:
7
44
274

*dp 방식
n= (n-1)+(n-2)+(n-3)
*/
public class Reculsive123 {

    //첫번째 방법 재귀-백준에선 틀린문제로 나옴
/*    public static int temp[] = new int[1000];

    public static int doFunc(int n){
        if(temp[n]!=0){
            return temp[n];
        }else if(n<=0){
            return 0;
        }
        return temp[n]=doFunc(n-1)+doFunc(n-2)+doFunc(n-3);
    }

    public static void main(String[] args){
        temp[1]=1;
        temp[2]=2;
        temp[3]=4;
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(doFunc(n));
    }*/

    public static int temp[] = new int[1000];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int play;

        temp[1]=1;
        temp[2]=2;
        temp[3]=4;

        for (int i = 0; i <n ; i++) {
            play=sc.nextInt();
            for (int j = 4; j <=play ; j++) {
                temp[j]=temp[j-3]+temp[j-2]+temp[j-1];
            }
            System.out.println(temp[play]);
        }

    }

    //재귀로 품 백준에서도 맞는문제
   /* public static int[] num = new int[1000];

    public static int doFunc(int n){
        if(num[n]!=0){
            return num[n];
        }

        return num[n]=doFunc(n-1)+doFunc(n-2)+doFunc(n-3);
    }


    public static void main(String[] args){
        num[1]=1;
        num[2]=2;
        num[3]=4;

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int play = sc.nextInt();
            System.out.println(doFunc(play));
        }




    }*/

}
