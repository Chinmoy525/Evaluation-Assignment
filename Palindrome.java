package com.company;

import java.util.Scanner;

import java.util.HashSet;

public class Palindrome {
    public static int Palindrome(String name) {
        HashSet<Character> set = new HashSet<>();
        int countNumber = 0;
        if(name == null || name.length() == 0){
            return 0;
        }
        for( int i=0 ; i<name.length();i++){
            if(set.contains(name.charAt(i))){
                set.remove(name.charAt(i));
                countNumber++;
            }else{
                set.add(name.charAt(i));
            }
        }
        if(set.isEmpty()){
            return countNumber*2;
        }else{
            return countNumber*2+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("name =");
        String s=sc.nextLine();
        System.out.println(Palindrome(s));
        sc.close();

    }
}
