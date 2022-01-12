import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i < n+1; i ++) {
            if (sol(i)) {
                cnt ++;
            }
        }
        System.out.println(cnt);

    }
    private static boolean sol(int n) {
        String s = String.valueOf(n);
        String[] split = s.split("");
        if (split.length ==1 || split.length == 2) {
            return true;
        }
        if (Integer.parseInt(split[0]) - Integer.parseInt(split[1]) ==
                Integer.parseInt(split[1]) - Integer.parseInt(split[2])) {
            return true;
        } else {
            return false;
        }
    }
}



