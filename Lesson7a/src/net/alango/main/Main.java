
package net.alango.main;

import java.io.*;

public class Main {
  
  public static void main( String[] args ) {
    
    PrintWriter pw = new PrintWriter( System.out, true );
    File file1 = new File( "a.txt" );
    try {
      file1.createNewFile();
    } catch ( IOException e ) {
      pw.println( "ERROR!" );
    }
    File folder = new File( "B" );
    folder.mkdirs();
    
    File file3 = new File( folder, "b.doc" );
    try {
      file3.createNewFile();
    } catch ( IOException e ) {
      System.out.println( e );
    }
    
    file1.renameTo( new File( "b.txt" ) );
    File file2 = new File( "b.txt" );
    
    file3.delete();
    folder.delete();
    file2.delete();
    File f1 = new File( "." );
    if ( f1.isDirectory() ) {
      String[] filenames = f1.list();
      for ( String filename : filenames ) {
        pw.println( filename );
      }
    }
  }
}
