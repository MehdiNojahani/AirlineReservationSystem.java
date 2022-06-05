package Package10;

import javax.swing.*;

public class Prime_Number {
        public static void main( String args[] ){

             int count = 0;
             String result = "";
             JTextArea output = new JTextArea( 30 ,30);

             JScrollPane scroller = new JScrollPane( output );

            int array[] = new int[1000];

             // initialize all array values to 1
            for ( int index = 0; index < array.length; index++ )
                 array[ index ] = 1;
             // starting at the third value, cycle through the array and put 0
             // as the value of any greater number that is a multiple
             for ( int i = 2; i < array.length; i++ )

             if ( array[ i ] == 1 )

             for ( int j = i + 1; j < array.length; j++ )

             if ( j % i == 0 )
                 array[ j ] = 0;

             // cycle through the array one last time to print all primes
             for ( int index = 2; index < array.length; index++ )

             if ( array[ index ] == 1 ) {
                 result += index + " is prime.\n";
                 ++count;
                 }

             result += "\n" + count + " primes found.";

             output.setText( result );

             JOptionPane.showMessageDialog( null, scroller, "Sieve",
                     JOptionPane.INFORMATION_MESSAGE );

             System.exit( 0 );

             } // end method main
        } // end class Sieve

