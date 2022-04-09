package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println ("Введите айпишник:");
        Scanner in = new Scanner (System.in);
        String ipp= in.next ();
        boolean result;
        result = ipp.matches("(((2[0-5]{2})|(2[0-4]\\d)|1\\d{2}|\\d{2}|\\d)\\.){3}((2[0-5]{2})|(2[0-4]\\d|1\\d{2}|\\d{2}|\\d))");
        if(result){
            System.out.println("True");}
        else{
            System.out.println("False");
        }
    }
}
