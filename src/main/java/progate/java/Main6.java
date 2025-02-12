package progate.java;//switch文

public class Main6 {
    public static void main(String[] args){
        //caseの後ろにはコロン(:)をつける
        int x = 8;
        switch(x % 2){
            case 0:
                System.out.println("偶数です");
                break;
                //breakとはswitch文を終了させる命令
            case 1:
                System.out.println("奇数です");
                break;

        }
    }
}
