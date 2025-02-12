package progate.java;//lengthメソッド
/*
配列.lengthのようにドット(.)で繋いで使う
これをすると{i < 3}を書き換えることができ、配列の要素数を気にする必要がなくなる
*/
public class Main14 {
    public static void main(String[]args){
        String[] names = {"John","Alice","Bob"};
        for(int i = 0; i < names.length; i++){
            System.out.println("hello!" + names[i]);
        }
    }
}
