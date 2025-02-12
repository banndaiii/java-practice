package Kemomimi;

public class Main3 {
    public static void main(String[] args){
        String[] strings = {"いち", "に", "さん"};
        for(int i = 0; i<10; i++){
//            System.out.println(i+"÷3は、"+(i/3)+"、あまり"+(i % 3)+"です");
            System.out.println(strings[i%3]);
        }
//        System.out.println(5%2);
    }
}
