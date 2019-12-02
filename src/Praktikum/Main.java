package Praktikum;

import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void StringBytes(){
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
            StringBytes();
        }else{
            System.out.println("Goodbye Beb!");
        }
    }

    public static void StringBuilderXXX(){
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
            StringBuilderXXX();
        }else{
            System.out.println("Goodbye Beb!");
        }
    }


    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
        System.out.print("1. String" +
                "\n2. StringBuilder" +
                "\n3. Exit" +
                "\n>>>>>>");
        int input = scan.nextInt();
        switch (input){
            case 1  :
                StringBytes();
                break;
            case 2  :
                StringBuilderXXX();
                break;
            default :
                break;
        }
    }
}
