package progate.java;//条件分岐

public class Main4 {
    public static void main(String[] args){
        //if(条件式){
        //  処理;
        int x = 10;
        if(x == 10){
            System.out.println("xは10です");
        }

        int y = 15;
        if(y == 10){
            System.out.println("yは10です");
            //条件式がfalseのため処理されない
        }
    }
}
