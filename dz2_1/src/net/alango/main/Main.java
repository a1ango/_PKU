package net.alango.main;

import java.util.Scanner;

public class Main
  {

    public static void main(String[] args)
      {

        Scanner sc = new Scanner( System.in );

        System.out.println( "Input the 5-digit number and press Enter:" );
     
        int number = sc.nextInt( );

        System.out.println(  );
        System.out.println(  );
        
        System.out.println( number / 10000 );
        number %= 10000;
        System.out.println( number / 1000 );
        number %= 1000;
        System.out.println( number / 100 );
        number %= 100;
        System.out.println( number / 10 );
        number %= 10;
        System.out.println( number / 1 );		

        System.out.println(  );
        
        System.out.println( "done." );
		sc.close();
      }

  }
