import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int arg = 1;
        
        for (int i = 0; i < 3; i++) {
            arg *= sc.nextInt();
        }
        
        String[] str = String.valueOf(arg).split("");
      
        
        // index += 1 로 각 숫자 카운트
        for (String n:str) {
            arr[Integer.parseInt(n)] += 1;
        }
      
        //print
        for (int i : arr) {
            System.out.println(i);
        }


    }
}
