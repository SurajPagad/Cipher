/* Cipher class to encrypt and decrypt the string entered */
public class Cipher
{ 
    char[][] b; 
    boolean flag;
    /**
     * checks whether the string length is perfect square number or not
     * @params len is the length of the string 
     * @returns sqrt is a integer number i.e square of the perfect square number or nearest perfect square number
    */
    public int checkpsq(int len)
    {
        int sqrt=(int)Math.sqrt(len);
        if(sqrt*sqrt==len)
        {
            flag=true;
            return sqrt;
        }
        else{
            flag=false;
            return sqrt;
        }
    }
    /**
     * calculates the number of extra rows to be added to the array
     * @param len is the length of string
     * @param sqrt is the square of nearest square number
     */
    public int calc(int len,int sqrt)
    {
        double extrchar=len-(sqrt*sqrt);
        return (int)(Math.ceil(extrchar/sqrt)+sqrt);
    }
    /**
     * Transfers the characters of string to a 2D array
     * @param str is the string reference
     * @param x number of rows of array
     * @param y number of columns of array
     */
    public void stringtoarray(String str,int x,int y)
    {
        int i,j,k=0;
        b=new char[x][y];
        for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
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
    /**
     * Displays the elements array
     * @param x number of rows of array
     * @param y number of columns of array
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
    /** Encrypts the string
     * @param str is the string reference
     * @params len is the length of the string
     */ 
    public void encrypt(String str,int len)
    {
        int sqrt=checkpsq(len);
        if(flag)
        {
            stringtoarray(str,sqrt,sqrt);
            System.out.print("Encrypted string: ");
            display(sqrt,sqrt);
        }
        else
        {
            int s=calc(len,sqrt);
            stringtoarray(str,s,sqrt);
            System.out.print("Encrypted string: ");
            display(sqrt,s);
        }
    }
    /** Decrypts the string
     * @param str is the string reference
     * @params len is the length of the string
     */ 
    public void decrypt(String str,int len)
    {
        int sqrt=checkpsq(len);
        if(flag)
        {
            stringtoarray(str,sqrt,sqrt);
            System.out.print("Decrypted string: ");
            display(sqrt,sqrt);
        }
        else
        {
            int s=calc(len,sqrt);
            stringtoarray(str,sqrt,s);
            System.out.print("Decrypted string: ");
            display(s,sqrt);
        }
    }
}
