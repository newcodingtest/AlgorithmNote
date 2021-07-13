package 치킨쿠폰재귀_38;

import java.util.Scanner;

/*
문제:
강민이는 치킨 한 마리를 주문할 수 있는 쿠폰을 n장 가지고 있다.
치킨집에서는 치킨 한 마리를 주문할 때마다 도장을 하나씩 찍어준다.
도장을 k개 모으면 치킨 쿠폰 한장으로 교환할 수 있다.
강민이가 지금 갖고 있는 치킨 쿠폰으로 치킨을 최대 몇 마리나 먹을 수 있는지 구하여라
단, 치킨을 주문하기 위해선 반드시 치킨 쿠폰을 갖고 있어야 한다.

예제 입력:n k
4 3
10 3
100 5

출력:
5
14
124
*/
public class ChikenReculsive {
    public static void main(String[] args)throws Exception{

    /*   //답 자체로는 맞지만 백준에선 틀린것으로 취급
        Scanner sc = new Scanner(System.in);

        int coupone = sc.nextInt(); // 쿠폰개수
        int stamp = sc.nextInt();  //치킨을 1마리에 필요한 도장개수
        int chicken = 0; // 총 도장 개수

        int countChicken = 0; //쿠폰으로 치킨을 시켜 추가되는 도장개수+기존 도장개수


        while(true) {
            if(coupone==0){
                break;
            }
            countChicken +=coupone;
            coupone /= stamp;
        }
        System.out.println(countChicken);*/
        Scanner sc = new Scanner(System.in);

        while(true) {
            int coupone = sc.nextInt(); // 쿠폰개수
            int stamp = sc.nextInt();  //치킨을 1마리에 필요한 도장개수

            if(coupone==0 || stamp==0){
                break;
            }else{
                int chiken = 0;
                chiken+=coupone;
                while (coupone>stamp) {
                    coupone /= stamp;
                    chiken+=coupone;
                }
                System.out.println("chiken = " + chiken);
            }
        }
    }

  /*  static int reculsive(int coupone, int chicken, int stamp){

        if(coupone<stamp){
            return chicken+coupone;
        }
        return reculsive((coupone/stamp)+(coupone%stamp),chicken+(coupone-coupone%stamp),stamp);

    }*/
}
