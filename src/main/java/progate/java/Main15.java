package progate.java;//拡張for文の文法
/*
for文をシンプルに書くための構文

for(データ型　変数名 : 配列名){
   繰り返す処理;
}
☆普通のforぶんと違い、インデックス番号を取得しなくていい
シンプルに書ける！
*/
public class Main15 {
    public static void main(String[]args){
        String[] names = {"John","Alice","Bob"};
        for(String name : names){
            System.out.println(name);
        }
    }
}
