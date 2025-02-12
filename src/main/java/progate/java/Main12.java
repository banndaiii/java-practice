package progate.java;//配列の要素を上書きする

public class Main12 {
    public static void main(String[]args){
        String[]names = {"Alice","john","tanaka"};
        System.out.println(names[1]);
        names[1] = "Kirisame";//1番目の要素を上書き
        System.out.println(names[1]);
    }
}
