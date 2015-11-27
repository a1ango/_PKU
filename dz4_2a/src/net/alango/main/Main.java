package net.alango.main;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
  {

    public static void main(String[] args)
      {

        Random rn = new Random( );
        Scanner sc = new Scanner( System.in );

        int[] a = {7,2,9,4};

        int tmp;
        for ( int i = 0; i < a.length/2; i++ )
          {
            tmp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = tmp;
          }
        System.out.println( Arrays.toString( a ) );
      }

  }