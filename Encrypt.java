/**
 * Encrypts the string
 */
public class Encrypt
{
    /**
     * Encrypts the string
     * @param str is the string
     * @param len is the length of string
     */
    public void encrypt( String str,int len )
    {
        CalcArraySize c = new CalcArraySize();
        Display d = new Display();
        int squaresize = c.arraysize( len );
        if( c.flag )
        {
            d.stringtoarray( str,squaresize,squaresize );
            System.out.print("Encrypted string: ");
            d.display( squaresize,squaresize );
        }
        else
        {
            int arows = c.append( len,squaresize );
            d.stringtoarray( str,arows,squaresize );
            System.out.print("Encrypted string: ");
            d.display( squaresize,arows );
        }
    }
}
