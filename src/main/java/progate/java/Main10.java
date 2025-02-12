package progate.java;//break,continue
/*
break
→任意の場所で終了できる

continue
→ある処理をスキップしてつぎの周を実行できる
*/

//break文
public class Main10 {
      public static void main(String[]args){
        for(int i = 1; i <= 10; i++){
            if(i > 5){
                break;
            }
            System.out.println(i+"回目のループです");
        }
    }
    //continue文
    public static void main1(String[]args){
        for(int j  = 1; j <= 10; j++){
            if(1 % 3 == 0){//iが3の倍数の時その周のr－府を終了、次のループを実行
                continue;
            }
            System.out.println(j);
        }
    }
}
