import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[] arr;


        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            arr = new int[n];
            double sum = 0;

            for (int j = 0; j < n; j++) {
                int number = sc.nextInt();
                arr[j] = number;
                sum += number;
            }

            double avg = sum/n;
            double cnt = 0;

            for (int k = 0; k < n; k++) {
                if (arr[k] > avg) {
                    cnt += 1;
                }
            }
            double ans = 100*(cnt/n);
            System.out.printf("%.3f",ans);
            System.out.print("%\n");
            }
        }
    }
