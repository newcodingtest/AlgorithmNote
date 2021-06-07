package Three_Six_Nine_20;

public class Game_369 {

    static public int get(int i){
       int cnt=0;

     while(i>0){
      if(i%10==3 || i%10==6 || i%10==9)
          cnt++;
          i/=10;
      }
        return cnt;
    }

    public static void main(String[] args){

        int n=100;

        for(int j=1; j<=n; j++){
            int cnt = get(j);

            if(cnt == 0){
                System.out.print(j+" ");
            }else{
                for(int c=0; c<cnt; c++) {
                    System.out.print("짝");
                }
                System.out.print(" ");
            }
        }

        
    }
}
