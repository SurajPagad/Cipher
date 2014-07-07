/**
 * Decrypts the string
 */
public class Decrypt
{  
    /**
     * Decrypts the string
     * @param str is the string entered
     * @param len is the length of string
     */
   public void decrypt( String str,int len )
   {
       Display d = new Display();
       CalcArraySize c = new CalcArraySize();
       int squaresize = c.arraysize(len);
       if( c.flag )
       {
            d.stringtoarray( str,squaresize,squaresize );
            System.out.print("Decrypted string: ");
            d.display( squaresize,squaresize );
       }
       else
       {
            int acols = c.append( len,squaresize );
            d.stringtoarray( str,squaresize,acols );
            System.out.print("Decrypted string: ");
            d.display( acols,squaresize );
       }
    }
}
