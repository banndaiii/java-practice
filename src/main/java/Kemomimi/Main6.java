package Kemomimi;

public class Main6 {
    public static void main(String[] args) {
        int kemono = mofu(mofu(1)) + 1;
        System.out.println(kemono);
    }
    public  static  int mofu(int num){
        return num*2;
    }
}