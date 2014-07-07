
/**
 * Transfers the string into an array
 */
public class StringToArray
{
    char[][] b;
    /**
     * Transfers the string into an array
     * @param str is the string entered
     * @param x is the size of row of the array
     * @param y is the size of column of the array
     */
    public void stringtoarray(String str,int x,int y)
    {
        int k=0;
        b=new char[x][y];
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                try
                {
                    b[i][j]=str.charAt(k++);
                }catch(StringIndexOutOfBoundsException e)
                {
                    b[i][j]='*';
                }
            }
        }
    }
}
