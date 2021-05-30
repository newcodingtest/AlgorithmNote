package 입력된숫자의개수를출력하기_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumPrint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] copy=new int[10]; //0~9까지 담는 배열


        while(x>0){
            copy[x%10]++; //입력받은 자리수를 배열의 인덱스값으로 받음
            x/=10;

        }

      for (int i=0; i<copy.length; i++){
          System.out.println(i+": "+copy[i]);

      }

    }
}
