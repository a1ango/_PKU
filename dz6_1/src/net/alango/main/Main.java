
package net.alango.main;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
  
  public static void main( String[] args ) {
    
    Calendar cl = Calendar.getInstance();
    Date dNow = new Date(), dThen = new Date();
    StringBuffer cb = new StringBuffer( "dd/MM/yyyy" );
    String dateFormat = cb.toString();
    SimpleDateFormat sdf = new SimpleDateFormat( dateFormat );
    
    StringBuffer str = new StringBuffer( cl.get( Calendar.DATE ) + "/" + cl.get( Calendar.MONTH ) + "/" + cl.get( Calendar.YEAR ) );
    
    String now = str.toString();
    String then = str.replace( 3, 5, String.valueOf( cl.get( Calendar.MONTH ) - 1 ) ).toString();
    try {
      dNow = sdf.parse( now );
      dThen = sdf.parse( then );
    } catch ( ParseException e ) {
      System.out.println( "Wrong input" );
    }
    
    String rezNow = sdf.format( dNow );
    String rezThen = sdf.format( dThen );
    System.out.println( "The 'now' is: \t\t" + rezNow );
    System.out.println( "The 'then' is: \t\t" + rezThen );
    System.out.print( "The diff. in [ms] is: \t" );
    System.out.println( dNow.getTime() - dThen.getTime() );
    
  }
}

