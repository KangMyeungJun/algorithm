

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int cnt= 0;

        for (int i = 0; i < t; i++) {
            int check = 0;
            String s = sc.nextLine();
            String[] split = s.split("");
            int[] arr = new int[26];

            for (int j =0; j < split.length; j++) {
                if (j == split.length-1) {
                    break;
                }
                if (split[j].equals(split[j + 1])) {
                    split[j] = "";
                }
            }
            
            for (String str : split) {
                if (!str.isEmpty()) {
                    int i1 = str.codePointAt(0);
                    arr[i1-97] +=1;
                }
            }
            
            for (int a : arr) {
                if (a > 1 ) {
                    check = 1;
                    break;
                }
            }
            
            if (check != 1) {
                cnt++;
            }

        }
        System.out.println(cnt);




    }

}



