/**
 * Displays the encrypted or decrypted string 
 */
public class Display extends StringToArray
{
    /**
     * @param x is the size of rows
     * @param y is the size of columns 
     */
    public void display(int x,int y)
    {
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                System.out.print(b[j][i]);
            }
        }
        System.out.println();
    }
}
