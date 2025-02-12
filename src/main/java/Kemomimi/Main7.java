package Kemomimi;

public class Main7 {
    public static void main(String[] args){
        System.out.println("あなたの名前を入力してね。");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してね。");
        int age = new java.util.Scanner(System.in).nextInt();
        System.out.println("ようこそ、"+age+"さいの"+name+"さん！");
    }
}
