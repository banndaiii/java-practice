package Kemomimi;

public class Main2 {
    public static void main(String[] args) {
        int year = 2024;
        String[] eto = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
        int number = (year + 9)%12;//番目
        System.out.println(year+"年の干支は" + eto[number - 1] + "だよ");

    }
}
