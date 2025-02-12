package progate.java;//default

public class Main7 {
    public static void main(String[] args){
        int number = 13;
        /*
        default(デフォルト)
        どのcaseにも一致しなっかた時に実行する処理
        */
        switch(number % 5){
            case 1:
                System.out.println("金メダル");
                break;
            case 2:
                System.out.println("銀メダル");
                break;
            case 3:
                System.out.println("銅メダル");
                break;
            default:
                System.out.println("メダルを獲得できませんでした");
                break;
        }
    }
}
