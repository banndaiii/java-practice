package progate.java;//else

public class Main5 {
    public static void main(String[] args){
        int x = 20;
        if(x < 15) {
            System.out.println("xは30より小さい");
        } else {
            System.out.println("xは30以上");

        }

        //else if
        int y = 15;
        if(x >= 30) {
            System.out.println("xは30以上");
        } else if(x > 20) {
            System.out.println("xは20より大きいく30より小さい");
        } else {
            System.out.println("xは20以下");

        }
    }
}
