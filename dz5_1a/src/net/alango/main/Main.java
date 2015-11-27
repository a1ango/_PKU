
package net.alango.main;

import java.util.*;

public class Main {
  
  public static void main( String[] args ) {
    
    Scanner sc = new Scanner( System.in );
    
    while ( true ) {
      System.out.println();
      System.out.println( "Input new mas:" );
      
      String[] a = ( sc.nextLine().split( "[,]" ) );
      int[] b = new int[ a.length ];
      for ( int i = 0 ; i < a.length ; i++ ) {
        b[ i ] = Integer.parseInt( a[ i ] );
      }
      
      print( b );
      System.out.println( "-> " + getNext( b ) );
    }
  }
  
  static int getNext( int[] mas ) {
    
    int next = 0;
    int n = mas.length;
    int rez = 1, d1 = 0, d2 = 0;
    
    while ( rez == 1 ) {
      for ( int i = 2 ; i < n ; i++ ) {
        d1 = ( mas[ i ] - mas[ i - 1 ] );
        d2 = ( mas[ i - 1 ] - mas[ i - 2 ] );
        rez *= ( d1 == d2 ) ? rez : 0;
      }
      
      if ( rez == 1 ) {
        next = mas[ n - 1 ] + d1;
        break;
      }
      
      rez = 1;
      for ( int i = 2 ; i < n ; i++ ) {
        d1 = ( int ) ( 1000000 * ( ( double ) mas[ i ] / ( double ) mas[ i - 1 ] ) );
        d2 = ( int ) ( 1000000 * ( ( double ) mas[ i - 1 ] / ( double ) mas[ i - 2 ] ) );
        rez *= ( d1 == d2 ) ? rez : 0;
      }
      if ( rez == 1 ) {
        next = mas[ n - 1 ] * d1 / 1000000;
        break;
      }
      rez = 1;
      for ( int i = 2 ; i < n ; i++ ) {
        d1 = ( int ) Math.round( 1000000 * ( Math.sqrt( mas[ i ] ) - Math.sqrt( mas[ i - 1 ] ) ) );
        d2 = ( int ) Math.round( 1000000 * ( Math.sqrt( mas[ i - 1 ] ) - Math.sqrt( mas[ i - 2 ] ) ) );
        rez *= ( d1 == d2 ) ? rez : 0;
      }
      if ( rez == 1 ) {
        next = ( int ) Math.pow( Math.sqrt( mas[ n - 1 ] ) + d1 / 1000000, 2 );
        break;
      }
      rez = 1;
      for ( int i = 2 ; i < n ; i++ ) {
        d1 = ( int ) Math.round( 1000000 * ( Math.pow( mas[ i ], 1 / 3. ) - Math.pow( mas[ i - 1 ], 1 / 3. ) ) );
        d2 = ( int ) Math.round( 1000000 * ( Math.pow( mas[ i - 1 ], 1 / 3. ) - Math.pow( mas[ i - 2 ], 1 / 3. ) ) );
        rez *= ( d1 == d2 ) ? rez : 0;
      }
      if ( rez == 1 ) {
        next = ( int ) Math.pow( Math.round( Math.pow( mas[ n - 1 ], 1 / 3. ) ) + d1 / 1000000, 3 );
        break;
      }
    }
    return next;
  }
  
  static void print( int[] a ) {
    
    for ( int k : a ) {
      System.out.print( k + " " );
    }
  }
  
}
