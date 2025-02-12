package progate.java;//for文
/*
for文はforのあとの()内に"変数の初期化、条件式、変数の更新"の3つを記述。
それぞれはセミコロン(;)で区切るが、変数の更新にはつけない

for(int i = 1; i <= 5; i++){
    System.out.println(i);
}
 */

public class Main9 {
    public static void main(String[]args){
        for(int a = 1; a <= 5; a++){
            System.out.println(a+"回目のループです");
        }
    }
}
