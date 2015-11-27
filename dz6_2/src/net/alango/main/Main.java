
package net.alango.main;

public class Main {
  
  public static void main( String[] args ) {
    
    int[] array = { 0, 4, 56, 78, 0 };
    System.out.print( arrayIntToString( array ) );
  }
  
  static String arrayIntToString( int[] array ) {
    
    StringBuffer cb = new StringBuffer( "" );
    cb = cb.append( array[ 0 ] );
    for ( int i = 1 ; i < array.length ; i++ ) {
      cb = cb.append( ", " + array[ i ] );
    }
    return ( "[" + cb.toString() + "]" );
  }
}
