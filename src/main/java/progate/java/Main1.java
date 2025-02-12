package progate.java;//キャストについて

public class Main1 {
    public static void main(String[]args){
        //int型の変数同士の割り算では片方をキャストする=3.25
        int number1 = 13;
        int number2 = 4;
        System.out.println((double)number1/number2);

        //キャストしない場合=3
        int number3 = 13;
        int number4 = 4;
        System.out.println(number3/number4);
    }
}
