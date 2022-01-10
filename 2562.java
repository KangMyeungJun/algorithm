import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            arr.add(sc.nextInt());
        }

        int max = arr.stream().max(Integer::compareTo).get().intValue(); //max value
        System.out.println(max);
        System.out.println(arr.indexOf(max)+1);
    }
}
