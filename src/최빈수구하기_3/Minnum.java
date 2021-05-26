package 최빈수구하기_3;


public class Minnum {
    public static void main(String[] args) {
        int[] arr= {1,2,2,3,1,4,2,2,4,3,5,3,2}; //주어진 숫자배열

        int[] copy=new int[arr.length]; //중복숫자 카운트 배열 생성
        for(int i=0; i<arr.length; i++) {
            copy[arr[i]]++; //[숫자배열]의 값을 [중복 숫자 배열]의 인덱스 값으로 갖고 값이 존재시 ++
        }

        int num=0;
        int cnt=0;
        for(int i=0; i<arr.length; i++) {
            if(cnt<copy[i]) {
                cnt=copy[i];// 계속 큰값을 cnt에 넣어준다.
                num=i; // 중복숫자 배열의 인덱스 값(숫자)을 num에 넣어준다
            }
        }
        System.out.println("최빈수는: "+num+" 빈도수는: "+cnt);
    }

}
