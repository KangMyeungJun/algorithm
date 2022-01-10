package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int temp = n;


        while (true) {
            int a = temp/10;
            int b = temp%10;
            int c = (a+b)%10;
            temp = 10*b+c;
            cnt +=1;
            if (temp == n) {
                break;
            }
        }
        System.out.println(cnt);
        }
    }


