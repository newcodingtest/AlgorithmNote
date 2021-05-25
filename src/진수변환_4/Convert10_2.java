package 진수변환_4;

public class Convert10_2 {
    public static void main(String[] args){
        int inputNum=25;
        int[] arr=new int[100];

        int i=0;
        int mok=inputNum;
        while(mok>0){
            arr[i]=mok%2;
            mok/=2;
            i++;
        }
        i--;
        for(; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
