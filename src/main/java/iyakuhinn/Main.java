package iyakuhinn;

import java.util.List;
import java.util.Scanner;
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args){
        ask(Question.Q1);
        ask(Question.Q2);

    }
    private static String ask(Question question){
        System.out.println(question.getText());
        String[] answers = question.getAnswers();
        String[] prefixes = {"A","B","c"};
        for(int i = 0; i<3; i++){
            System.out.println(prefixes[i] + " : " + answers[i]);
        }
        while(true){
            String imput = SCANNER.next();
            if (List.of(prefixes).contains(imput)){
                return imput;
            } else {
                System.out.println("A,B,Cの」いずれかを入力してください");
            }
        }
    }
}
