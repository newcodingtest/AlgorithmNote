package 최빈수구하기_3;


public class Minnum {
    public static void main(String[] args) {
        int[] arr= {1,2,2,3,1,4,2,2,4,3,5,3,2};

        int[] copy=new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            copy[arr[i]]++;
        }

        int num=0;
        int cnt=0;
        for(int i=0; i<arr.length; i++) {
            if(cnt<copy[i]) {
                cnt=copy[i];
                num=i;
            }
        }
        System.out.println("최빈수는: "+num+"빈도수는: "+cnt);
    }

}
