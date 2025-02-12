package kemono;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("あなたの名前を教えてね");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("ありがとう！"+name+"さん");
        System.out.println("先に聞いておきたいんだけど…");

        System.out.println(""+name+"さんは\"けもみみ\"ですか？");
        String anser = new java.util.Scanner(System.in).nextLine();
        if (Objects.equals(anser, "はい")){
            System.out.println("んおおおおおおかわいいいいいいいいいいいいいいいいいいいい");
        } else {
            System.out.println("ああそう…");
            System.out.println("体毛は濃い？");
            String mofu  = new java.util.Scanner(System.in).nextLine();
        if (Objects.equals(mofu, "いいえ")){
            System.out.println("残念……"+name+"さんはけもみみではないね………さよなら");
        } else {
            System.out.println("体毛濃いなら立派なけもみみです！！！！あ～もふもふもふ");
            }
        }
    }
}

