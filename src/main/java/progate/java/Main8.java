package progate.java;//繰り返し処理
public class Main8 {
    public static void main(String[] args){
    /*
    while文
    "～の間"という意味
    条件がtrueの間、{}内の処理を繰り返す。

    while(条件){
      繰り返す処理;

     */
     int i = 1; //変数を定義
     while(i <= 5){
         System.out.println(i);
         i++; //iに1を追加していく。この処理を忘れると無限ループになる
     }

    }
}
