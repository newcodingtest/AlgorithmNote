package 평균넘는학생비율출력;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//입력받은 숫자중에서 평균치를 넘는 비율을 구하여라
public class averageRate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] m=n.split(" ");

        int[] arr=new int[m.length];

        for (int i = 0; i <arr.length ; i++) {
            //문자열을 숫자열로 변환
            arr[i]=Integer.parseInt(m[i]);
        }
        System.out.println("숫자열 변환 출력 테스트"+Arrays.toString(arr));
        System.out.println("arr.length = " + arr.length);

        int sum=0; // 합계

        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        System.out.println("합계 = " +sum);

        double average=sum/arr.length; // 평균치
        System.out.println("average = " +average);
        int nice=0; //평균치를 넘는 사람의 수


        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>average){
                nice++;
            }
        }
        System.out.println(" nice : "+nice);
        System.out.println(" 평균치를 넘는 비율은?: "+nice/(double)arr.length*100);


    }
}
