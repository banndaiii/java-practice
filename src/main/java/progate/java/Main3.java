package progate.java;//大小比較と論理演算子

public class Main3 {
    public static void main(String[] args){
        System.out.println(2 > 6);//false
        //x > y  yのほうが小さい時true

        System.out.println(8 / 4 < 5);//true
        //x < y  yのほうが大きい時true

        System.out.println(4 + 2 >= 6);//true
        //x >= y  yのほうが小さいまたは等しい時true

        System.out.println(2 * 5 <= 9);//false
        //z <= y  yのほうが大きいまたは等しい時true

        //[かつ]条件1 && 条件2
        //"条件1がtrueかつ条件2もtrue"であれば結果もtrue
        System.out.println(5 > 10 && 5 < 30);//false
        System.out.println(20 > 10 && 20 < 30);//true
        System.out.println(35 > 10 && 35 < 30);//false

        //[または]条件1}||条件2
        //"条件1または条件2のどちらか一方でもtrue"であれば結果はtrue
        System.out.println(5 < 10 || 5 > 30);//true
        System.out.println(20 < 10 || 20 > 30);//false
        System.out.println(35 < 10 || 35 > 30);//true

        //[～でない]
        System.out.println(20 >= 30);//false
        //!を用いると[～でない]を表現できる
        //xがy以上でない(yより小さい)時trueになり、xがyより大きい時false
        System.out.println(!(20 >= 30));//true

        //&&はどちらもtrueでなければ全体の結果もtrueにならない
        //||はどちらか一方でもtrueであれば全体の結果もtrueになる
    }
}
