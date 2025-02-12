package iyakuhinn;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("はじめまして！");
        System.out.println("わたしは登販けもみみです。");
        System.out.println("症状からオススメの市販薬を提案します。");
        System.out.println("持病があったり処方された薬を飲んでいる場合は医者けもみみに相談してください！");
        System.out.println("A,B,Cの中から１つ回答してね。");

        String[] questions = {"Q1.痛む場所はどこですか",
                "Q2.痛み止めなどを飲まない場合、頭痛はどのぐらい続きますか",
                "Q3.痛みの種類はどのような感じですか",
                "Q4.痛いとき、どのようになりますか",
                "Q5.生活への支障はありますか",
                "Q6.頭痛の頻度はどのくらいですか",
                "Q7.頭痛以外の症状はありますか"};
        String[][] choices = {
                {"片側のこめかみ周辺、ときに両側や後頭部も","後頭部から首筋にかけて","片側の目の奥から側頭部(いつも同じ側)"},
                {"半日以上３日未満","30分のこともあれば1年中のことも","1～3時間"},
                {"ズキンズキンと脈打つような痛み","締め付けられるような、押されるような痛み","片目の奥をえぐられるような痛み"},
                {"動くと痛みが増す、じっとしている方が楽","動いても痛みは悪化せず寝込むほどでもない","痛みのためじっとしてられない"},
                {"痛みで仕事や家事、勉強がなかなか進まない","それほど支障はない","痛いときは何も手につかない"},
                {"月に平均2～6回ほど","月に数回のこともあれば月に15日以上のことも","半年～2年ごとで、 1度起きると2週間以上痛む"},
                {"光・音がわずらわしい、吐き気がある","光・音が気になることはあってもどちらかひとつ","痛む側の涙、鼻水、鼻詰まり"}
        };

        int countA = 0;
        int countB = 0;
        int countC = 0;

        System.out.println("回答を終了する場合は　exit と入力してね！");

        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            for (int j = 0; j < choices[i].length; j++){
                System.out.println((char)('a' + j) + ". " + choices[i][j]);

            }
            System.out.print("回答: ");
            String answer = scanner.nextLine().trim();

            if (answer.equalsIgnoreCase("exit")){
                break;
            }

            switch (answer.toLowerCase()){
                case "a":
                    countA++;
                    break;
                case "b":
                    countB++;
                    break;
                case "c":
                    countC++;
                    break;
                default:
                    System.out.println("無効な回答だよ！A,B,Cのいずれかで回答してね。");
                    break;

            }
        }

        if (countA > countB && countA > countC){
            System.out.println("Aが一番多く選択されました！");
            System.out.println("あなたは片頭痛の可能性があります！");
            System.out.println("とにかく痛みをなんとかしたい方は、ロキソプロフェンが主成分の鎮痛薬がオススメです。");
             System.out.println("ロキソニンSなら眠くなる成分も入っていないのでオススメかも。");
            System.out.println("胃に優しい薬を選びたい方はアセトアミノフェンが主成分の鎮痛薬を選ぶといいです。");
            System.out.println("有名なのはバファリンとかですね。");
        } else if (countB > countA && countB > countC){
            System.out.println("Bが一番多く選択されました！");
            System.out.println("あなたは緊張型頭痛の可能性があります！");
            System.out.println("とにかく痛みをなんとかしたい方は、ロキソプロフェンが主成分の鎮痛薬がオススメです。");
            System.out.println("ロキソニンSなら眠くなる成分も入っていないのでオススメかも。");
            System.out.println("胃に優しい薬を選びたい方はアセトアミノフェンが主成分の鎮痛薬を選ぶといいです。");
            System.out.println("有名なのはバファリンとかですね。");
            System.out.println("他にも、イブプロフェンが主成分の鎮痛薬もあります。");
        } else if (countC > countA && countC > countB){
            System.out.println("Cが一番多く選択されました！");
            System.out.println("あなたは群発頭痛の可能性があります！");
            System.out.println("市販薬では群発頭痛の痛みを抑えることは難しいです。");
            System.out.println("なるべく早く医者けもみみに相談してください！");
        } else {
            System.out.println("複数の選択肢が同じ回数選択されました！やり直してね！");
        }

        scanner.close();

    }
}
