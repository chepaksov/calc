package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {

        System.out.println("Введите ...");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String vvod = reader.readLine();

        String q ="";

        String str = vvod.replaceAll(" ", "");

        String digit;

        char[] arr = str.toCharArray();
        String temp = "";
        String temp0 = "";

        for (int i = 0; i < arr.length; i++) {


            digit = Character.toString(arr[i]);

            if (arr[0] == '-') {throw  new Exception("Число должно быть положительным");}
            if ( ".,".contains(digit)) { throw new Exception("Число должно быть целым");}

            try {
                if (Character.isLetter(arr[i])) temp0 = temp0 + (arr[i]);

                if (Character.isLetter(arr[i]) == false && Character.isDigit(arr[i])!=true && !temp0.equals(""))  { Rim r = new Rim(); r.rim1(temp0);}
                if (Character.isLetter(arr[i+1]) && i + 1 >= arr.length && Character.isDigit(arr[i+1])!=true) { Rim r = new Rim(); r.rim1(temp0);}
            }

            catch (Exception c) {   if (Character.isDigit(arr[i]))  {}  else  { Rim r = new Rim(); r.rim1(temp0);}   }

            try {
                if (Character.isDigit(arr[i])) temp = temp + arr[i];
                if (Character.isDigit(arr[i]) != true && Character.isLetter(arr[i]) != true && !temp.equals("")) {Digit dig = new Digit(); dig.digit1(temp);}
                if (Character.isDigit(arr[i + 1]) && i + 1 >= arr.length && Character.isLetter(arr[i+1])!=true) {Digit dig = new Digit(); dig.digit1(temp);}

            }

            catch (Exception c ) {  if (Character.isLetter(arr[i]))  {}  else  {Digit dig = new Digit();  dig.digit1(temp);}}

            if ("+-/*".contains(digit)) {  temp=""; temp0=""; q = digit;  if (arr[i+1] == '-') {throw new Exception("Число должно быть положительным");}   }

                    }



        if (Rim.count_r > 0 && Digit.count_c > 0) { throw new Exception("Нельзя производить операции с арабскими и римскими числами одновременно");}



        if (Digit.count_c == 2) {
            char r = q.charAt(0);
            if (r == '+' ) { System.out.println(Digit.d + Digit.d1); }
            else if (r == '-') { System.out.println(Digit.d - Digit.d1);}
            else if (r == '/') { System.out.println(Digit.d / Digit.d1);}
            else if (r == '*') { System.out.println(Digit.d * Digit.d1);}
            else throw new Exception("Вы ввели неверный арифмитический знак");}

        else {
            char r = q.charAt(0);
            if (r == '+') {System.out.println (Rim.RomanNumerals(Rim.asd + Rim.asd1));}
            else if ( r == '-') {System.out.println (Rim.RomanNumerals(Rim.asd - Rim.asd1));}
            else if ( r == '/') {System.out.println (Rim.RomanNumerals(Rim.asd / Rim.asd1));}
            else if ( r == '*') {System.out.println (Rim.RomanNumerals(Rim.asd * Rim.asd1));}

        }


        }


    }
