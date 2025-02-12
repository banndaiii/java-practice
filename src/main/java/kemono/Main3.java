package kemono;

import java.util.Scanner;
public class Main3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = multiplyByTwo(number);
        System.out.println("Result: " + result);

        scanner.close();

    }

    public static int multiplyByTwo(int num){
        return num * 2;
    }
}
