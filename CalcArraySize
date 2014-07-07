/**
 * Calculates the array size
 */
public class CalcArraySize
{
    boolean flag;
    /**
     * calculate the array size to be used
     * @param len is the length of string
     */
    public int arraysize(int len)
    {
        int size = ( int )Math.sqrt( len );
        if( size*size == len )
        {
            flag=true;
            return size;
        }
        else
        {
            flag=false;
            return size;
        }
    }
    /**
     * calculates the number of extra rows or columns to be added to the array
     * @param len is the length of string
     * @param sqrt is the square of nearest square number
     */
    public int append( int len,int size )
    {
        double extrchar = len - ( size * size );
        return (int)( Math.ceil( extrchar / size )+size );
    }
}
