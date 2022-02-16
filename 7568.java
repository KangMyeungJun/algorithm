import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            arr[i][0] = x;
            arr[i][1] = y;
        }

        int cnt = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if ((arr[i][0] < arr[j][0]) && (arr[i][1] < arr[j][1])) {
                    cnt++;
                }
            }
            System.out.print(cnt + " ");
            cnt = 1;
        }
    }
}
