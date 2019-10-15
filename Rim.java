package com.javarush.task.task13.task1322;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Rim {

       public static int count_r = 0;
    public static int count_r1 = 0;
       public static int asd ;
         public static int asd1;

        ArrayList<Integer> aq = new ArrayList<>();
       public Rim() {

       }

       public void rim1(String zn) throws Exception
       {

           int gf=0;
           HashMap<String, Integer> bukovki = new HashMap<>();

           bukovki.put("I", 1);
           bukovki.put("II", 2);
           bukovki.put("III", 3);
           bukovki.put("IV", 4);
           bukovki.put("V", 5);
           bukovki.put("VI", 6);
           bukovki.put("VII", 7);
           bukovki.put("VIII", 8);
           bukovki.put("IX", 9);
           bukovki.put("X", 10);


           for (HashMap.Entry<String, Integer> pair : bukovki.entrySet())
           {
               String key = pair.getKey();                      //ключ
               Integer value = pair.getValue();                  //значение
               if (key.equals(zn.toUpperCase())) {gf = value; count_r1++; aq.add( value); count_r++;   }

           }
           if (gf == 0) {throw new Exception("Вы ввели неверное римское число");}



           if (count_r1 == 1 ) {asd = aq.get(0); }
           if (count_r1 == 2) {asd1 = aq.get(0); }

       }

    public static String RomanNumerals(int Int123) {
        LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
        roman_numerals.put("M", 1000);
        roman_numerals.put("CM", 900);
        roman_numerals.put("D", 500);
        roman_numerals.put("CD", 400);
        roman_numerals.put("C", 100);
        roman_numerals.put("XC", 90);
        roman_numerals.put("L", 50);
        roman_numerals.put("XL", 40);
        roman_numerals.put("X", 10);
        roman_numerals.put("IX", 9);
        roman_numerals.put("V", 5);
        roman_numerals.put("IV", 4);
        roman_numerals.put("I", 1);

        String res = "";
        for(Map.Entry<String, Integer> entry : roman_numerals.entrySet()){
            int matches = Int123/entry.getValue();
            res += repeat(entry.getKey(), matches);
            Int123 = Int123 % entry.getValue();
        }
        return res;
    }
    public static String repeat(String s, int n) {
        if(s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }


   }
