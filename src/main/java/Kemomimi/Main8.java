package Kemomimi;

public class Main8 {
    public static void main(String[] args){
        int kemomimi = new java.util.Random().nextInt(500);
        System.out.println("けもみみさんの集めたどんぐりは"+kemomimi+"個……");
        System.out.println("すごい！沢山あつめたね！！");
        System.out.println("あ……そういえば名前聞いてなかった…");
        System.out.println("お名前はなんですか？");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("ありがとう！よろしくね！"+name+"さん！");
    }
}
