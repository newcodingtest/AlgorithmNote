package 진수변환_4;

public class Convert10_2 {
    public static void main(String[] args){
        int inputNum=25; //10진수
        int[] arr=new int[100]; //몫이 담기는 배열

        int i=0; // 몫배열에 담길 인덱스 번호
        int mok=inputNum;
        while(mok>0){
            arr[i]=mok%2; // 2로 나눈 나머지 값을 배열에 담기
            mok/=2; //2로 나눈 몫을 다음 mok으로
            i++; //배열 인덱스 증가
        }
        i--;
        for(; i>=0; i--){ //거꾸로 출력      16 8 4 2 1 -> 11001
            System.out.print(arr[i]);
        }
    }
}
