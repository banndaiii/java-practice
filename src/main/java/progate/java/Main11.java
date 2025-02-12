package progate.java;//配列とは
/*
配列とは変数のセットのようなもの。
配列に入ってる値のことを要素という。

int型の要素を持つ配列型
int[]

String型の要素を持つ配列
String[]

配列は{}の中にコンマ(,)で区切りながら値を書いて作る
int[]numbers = {5,11,29};
配列の要素にはインデックス番号があり、左から0,1,2,....と続く。
各要素は、配列名[インデックス番号]とすることで取得できる

String[]names = {"Alice","john","Bob"};
System.out.println("私の名前は"+names[0]+"です");
*/

public class Main11 {
    public static void main(String[]args){
        String[]names = {"にんじゃわんこ","ひつじ仙人","ベイビーわんこ"};
        System.out.println("彼の名前は"+names[0]+"です");
    }
}
