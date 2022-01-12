import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        int a = 1;
        while (a < 10001) {
            arr.add(solution(a));
            a++;
        }
        for (int i = 1; i < 10001; i++) {
            if (!arr.contains(i)) {
                System.out.println(i);
            }
        }
    }
    private static int solution(int n) {
        int temp = n;
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            n +=temp%10;
            temp /= 10;
        }
        return n;
    }
}


