package 최대공약수_6;

public class SameMax {
    public static void main(String[] args){
        int x=12;
        int y=18;

        int max=1;

        for(int i=1; i<=18; i++){
            if(x%i == 0 && y%i == 0){
             max=i;
            }
        }
        System.out.println("max = " + max);
    }
}
