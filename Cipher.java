public class Cipher
{ 
    char[][] b; 
    boolean flag;
    public Cipher()
    {
        flag=false;
    }
    /* Checks whether string length is perfect square and returns the square number or
    else returns the nearest square number */
    public int checkperfectsqr(int len)
    {
        int t=0;
        for(int p=0;p<=len/2;p++) 
        {
            if((p*p)==len)
            {
                flag=true;
                t=p;
                break;
            }else if((p*p)<len)
            {    
                t=p;
            }
        }
        return t;
    }
    /* calculates the number of rows or columns to be appended if string length is
    not a perfect square */
    public int calc(int len,int t)
    {
        int e,s=1,p;
        e=len-(t*t);
        for(p=1;p<=e;p++)
        {
            if(((p%t)==0)&&(p<e))
            {
                s++;
            }
        }   
        return s+t;
    }
    /* copies the string to a two dimensional array */
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
    /* Displays the two dimensional array */ 
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
    /* Encrypts the string and displays it */
    public void encrypt(String str,int len)
    {
        int t,s;
        t=checkperfectsqr(len);
        if(flag)
        {
            stringtoarray(str,t,t);
            display(t,t);
        }
        else
        {
            s=calc(len,t);
            stringtoarray(str,s,t);
            display(t,s);
        }
    }
    /* Encrypts the string and displays it */
    public void decrypt(String str,int len)
    {
        int t,s;
        t=checkperfectsqr(len);
        if(flag)
        {
            stringtoarray(str,t,t);
            display(t,t);
        }
        else
        {
            s=calc(len,t);
            stringtoarray(str,t,s);
            display(s,t);
        }
    }
}    
        
