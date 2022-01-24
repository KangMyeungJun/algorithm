
import java.util.Scanner;
public class Main {
    public void sol(int n, int m) {
        boolean[] check = new boolean[n+1];
        int c = 0;
        for (int i = 2; i < n+1; i++) {
            if (check[i]==true) {
                continue;
            } else {
                if (i >= m) {
                    System.out.println(i);
                }
               
                for (int j = i+i; j< n+1;) {
                    check[j] = true;
                    j  +=i;
                }
            }
        }
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        new Main().sol(m,n);
    }
}
