package com.util.Lzo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException
    {
        System.out.println( "Hello World!" );
        InputStream in = null;
        in = new BufferedInputStream(new FileInputStream("netjs/Hadoop/Data/log.txt"));

        LzoCompressor compressor=new LzoCompressor();
        
        //return int
        //compressor.compress(b, off, len);
    }
}
