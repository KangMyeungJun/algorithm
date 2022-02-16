import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        int result = 0;
        for (int i = 1; i < n; i++) {
            String[] split = String.valueOf(i).split("");
            for (int j = 0; j < split.length; j++) {
                temp += Integer.parseInt(split[j]);
            }
            if (i + temp == n) {
                result = i;
                break;
            }
            temp = 0;
        }
        System.out.println(result);

    }
}
