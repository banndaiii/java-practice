package Kemomimi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("input: ");
            String input = br.readLine();
            if (input.equals("quit")) {
                break;
            }
            try {
                int year = Integer.parseInt(input);//integer=インテジャー
                System.out.println("入力したのは" + year + "です");
                String[] eto = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
                int number = (year + 9)%12;//番目
                System.out.println(year+"年の干支は" + eto[number - 1] + "だよ");

            }catch (NumberFormatException e){
                System.out.println("数値を入力してください");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("そんなものはない");
            }
        }
    }
}
