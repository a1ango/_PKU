package net.alango.main;

import java.util.Scanner;

public class Main
  {

    public static void main(String[] args)
      {

        Scanner sc = new Scanner( System.in );

        System.out.println( "Простые числа:" );

        for ( int i = 2, d = 0; i <= 100; i++ )
          {
            for ( int j=i - 1; j > 1; j-- )
              {
                if ( i % j == 0 )
                  {
                    d++;
                  }
              }

            if ( d == 0 )
              {
                System.out.println( i );

              }
            d = 0;
          }

        sc.close( );
      }
  }