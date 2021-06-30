package 달팽이_27;


import java.util.Scanner;

/* 출력
예제 입력n: 5

        1  2   3  4   5
        16 17 18 19  6
        15 24 25 20  7
        14 23 22 21  8
        13 12 11 10  9


문제해결:
연산되는 패턴의 수를 구하자 위의 그림은 위,아래,왼,오른쪽 연산으로 9번의 총 연산수가 구해진다 2*n-1
 */
public class dal {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr=new int[n][n];
        int x =0;
        int y= 0;
        int cnt =1;
        int tp =n; //가로,세로 연산 마다 기록되야할 길이값을 기록

        for (int i = 0; i <2*n-1 ; i++) { //총 9번 반복
            switch (i%4){ // 위 아래 왼 오 4방향으로 연산이 진행되기 때문
                case 0://1  2   3  4   5 표현
                    for (int j = 0; j <tp ; j++) {
                        arr[x][y]=cnt;
                        cnt++;
                        y++;
                    }
                    x++; //현재 x=1
                    y--; //현재 y=4
                    tp--; //4
                    break;
                case 1:
                    for (int j = 0; j <tp ; j++) {
                        arr[x][y]=cnt;
                        x++;
                        cnt++;
                    }
                    x--; //현재 x=4
                    y--;  //현재 y=3
                    break;
                case 2:
                    for (int j = 0; j <tp ; j++) {
                        arr[x][y]=cnt;
                        y--;
                        cnt++;
                    }
                    x--; ///현재 x=3
                    y++;//현재 y=0
                    tp--; // 현재 tp=3
                    break;
                case 3:
                    for (int j = 0; j <tp ; j++) {
                        arr[x][y]=cnt;
                        x--;
                        cnt++;
                    }
                    x++; ///현재 x=1
                    y++;//현재 y=1
                    break;
            }
        }

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println();
        }





        }
    }

