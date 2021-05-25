package 파보나치수열_2;

import java.util.ArrayList;
import java.util.Arrays;

public class fibo {
    public static void main(String[] args) {
        int[] arr=new int[100];

        arr[1]=1;
        arr[2]=1;

        for(int i=3; i<arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }

        for(int i=1; i<=10; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
