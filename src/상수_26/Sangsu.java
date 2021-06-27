package 상수_26;

//만약 칠판에 734  893을 적었다면
//거꾸로 읽어서 둘중에 큰수를 출력한다.
//437
public class Sangsu {
    public static void main(String[] args){
        int first = 734;
        int second = 893;

        int f[] = new int[3];
        int s[] = new int[3];

        int lenF = 0;
        int lenS = 0;
        do{
            f[lenF] = first % 10;
            first /= 10;
            lenF++;
        }while(first>0);

        int tmpA =1;
        int A = 0;
        for (int i=f.length-1; i>=0; i--){
            A+=f[i]*tmpA;
            tmpA*=10;
        }
        System.out.println("A: "+A);

        do{
            s[lenS] = second % 10;
            second /= 10;
            lenS++;
        }while(second>0);

        int tmpB =1;
        int B= 0;
        for (int i=s.length-1; i>=0; i--){
            B+=s[i]*tmpB;
            tmpB*=10;
        }
        System.out.println("B: "+B);

        System.out.println("둘중에 큰수는 " +((A>B) ? A:B));
    }
}
