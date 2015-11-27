
package net.alango.main;

public class Main {
  
  public static void main( String[] args ) {
    
    printNDigits( Math.PI, 10, 2 );
    System.out.println();
    printNDigits( Math.E, 5, 3 );
    System.out.println();
    printNDigits( 234.12345, 3, 0 );
    System.out.println();
    printNDigits( 12345.1234567890, 1, 5 );
    System.out.println();
  }
  
  static void printNDigits( double number, int rows, int startDigits ) {
    
    System.out.println( rows + " rows & " + startDigits + " digits in the 1st row:" );
    for ( int i = 0 ; i < rows ; i++ ) {
      System.out.println( i + 1 + ": \t" + strNDigits( number, i + startDigits ) );
      
    }
  }
  
  static String strNDigits( double number, int digits ) {
    
    StringBuffer cb = new StringBuffer( "" );
    cb = cb.insert( 0, number );
    cb.setLength( ( Integer.toString( ( int ) ( number ) ).length() ) + digits + 1 );
    return cb.toString();
    
  }
}
