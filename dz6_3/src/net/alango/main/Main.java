
package net.alango.main;

import java.util.Scanner;

public class Main {
  
  public static void main( String[] args ) {
    
    Scanner sc = new Scanner( System.in );
    
    while ( true ) {
      System.out.println();
      System.out.println( "Input binnary number:" );
      
      convert( sc.nextLine() );
    }
  }
  
  static void convert( String str ) {
    
    int rez = 0;
    int[] intArr = new int[ str.length() ];
    for ( int i = 0 ; i < intArr.length ; i++ ) {
      intArr[ i ] = Integer.parseInt( str.substring( str.length() - i - 1, str.length() - i ) );
    }
    for ( int i = 0 ; i < intArr.length ; i++ ) {
      rez += intArr[ i ] * Math.pow( 2, i );
    }
    System.out.println( str + " => " + rez );
  }
}
