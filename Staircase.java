package com.company;

import java.util.Scanner;

public class Staircase {
    public static int stairs(int n) {
        if(n==0||n==1){
            return n;
        }
        int num1= 1, num2= 1;
        int num3= 0;
        for(int i=1;i<n;i++){
            num3 =num1+num2;
            num1 = num2;
            num2 = num3;
        }
        return num3;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("n = ");
        int n=sc.nextInt();
        System.out.println("There are "+stairs(n)+" ways to climb to the top.");
        sc.close();

    }
}
