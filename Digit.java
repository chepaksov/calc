package com.javarush.task.task13.task1322;

import java.util.ArrayList;

public class Digit {
  public static int count_c = 0;
    public static int count_c1 = -1;


    public static float d;
  public static float d1;

    public Digit() {

    }


    public void digit1(String cifra) throws Exception {
      float z = Float.parseFloat(cifra);
        if (z > 10 || z < 1)  throw new Exception("Вы ввели число более 10");

      count_c++;
      count_c1++;

        ArrayList<Short> arr = new ArrayList<Short>();
        arr.add(Short.parseShort(cifra));

        if (count_c1==0)  d = arr.get(0);
        if (count_c1==1) d1 = arr.get(0);


      }


  }
