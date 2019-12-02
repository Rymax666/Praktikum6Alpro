package Praktikum;

import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void Cara1(){
        String input = null;
        Scanner scan = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan String : ");
        try {
            input = bf.readLine();
        }catch (Exception e){
            System.out.println("String Bos!");
        }


        // getBytes() method untuk convert string ke bytes[]
        byte [] strAsByteArray = input.getBytes();
        byte [] result = new byte [strAsByteArray.length];

        // simpan hasil dalam urutan terbalik hasil byte[]
        for (int i = 0; i<strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length-i-1];

        System.out.println("After Reverse : "+new String(result));

        System.out.print("\nLagi Beb ? Y/N" +
                "\n >>>>>");
        char c = scan.next().charAt(0);
        if (c == 'Y' || c == 'y'){
            Cara1();
        }else{
            System.out.println("Goodbye Beb!");
        }
    }

    public static void Cara2(){
        String input = null;
        Scanner scan = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan String : ");
        try {
            input = bf.readLine();
        }catch (Exception e){
            System.out.println("String Bos!");
        }

        StringBuilder input1 = new StringBuilder();

        // append string ke StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1 = input1.reverse();

        // print reverse String
        System.out.println(input1);

        System.out.print("\nLagi Beb ? Y/N" +
                "\n >>>>>");
        char c = scan.next().charAt(0);
        if (c == 'Y' || c == 'y'){
            Cara2();
        }else{
            System.out.println("Goodbye Beb!");
        }
    }

    public static void Cara3(){
        String input = null;

        Scanner scan = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan String : ");
        try {
            input = bf.readLine();
        }catch (Exception e){
            System.out.println("String Bos!");
        }

        char[] Reverse  = input.toCharArray();
        for (int i = input.length()-1; i >= 0; i--){
            System.out.print(Reverse[i]);
        }
        System.out.println(" ");
        System.out.print("\nLagi Beb ? Y/N" +
                "\n >>>>>");
        char c = scan.next().charAt(0);
        if (c == 'Y' || c == 'y'){
            Cara3();
        }else{
            System.out.println("Goodbye Beb!");
        }
    }



    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
        System.out.print("Ada Banyak Cara, Saya Abil 3 : " +
                "\n1. Using Byte" +
                "\n2. Using Reverse Method" +
                "\n3. Using toCharArray" +
                "\n>>>> ");
        int input = scan.nextInt();
        switch (input){
            case 1  :
                Cara1();
                break;
            case 2  :
                Cara2();
                break;
            case 3  :
                Cara3();
            default :
                break;
        }
    }
}
