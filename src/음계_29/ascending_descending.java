package 음계_29;

import java.util.Scanner;

// 1부터 8까지 차례대로 입력되면 ascending
// 8부터 1까지 차례데로 입력되면 descending, 둘다 아니면 mixed를 출력
public class ascending_descending {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[8];

        for (int i = 0; i <arr.length-1 ; i++) {
            arr[i]=sc.nextInt();
        }
        check(arr);
    }

    private static void check(int[] arr) {
        boolean aflag=true;
        boolean bflag=true;

        if(arr[0]!=1 ){
            aflag=false;
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]-arr[i+1]!=-1){
                aflag=false;
            }
        }

        if(arr[0]!=8){
            bflag=false;
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]-arr[i+1]!=1){
                bflag=true;
            }
        }
        if(aflag){
            System.out.println("ascending");
        }else if(bflag){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }


    }
}
