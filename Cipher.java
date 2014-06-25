public class Cipher
{ 
    char[][] b; 
    boolean flag;
    public Cipher()
    {
        flag=false;
    }
    public int checkpsq(int len)
    {
        int t=0;
        for(int p=0;p<=len/2;p++) //check if perfect square number
        {
            if((p*p)==len)
            {
                flag=true;
                t=p;
                break;
            }else if((p*p)<len)//nearest perfect square number
            {    
                t=p;
            }
        }
        return t;
    }
    public int calc(int len,int t)
    {
        int e,s=1,p;
        e=len-(t*t);
        for(p=1;p<=e;p++)//s is number of extra rows to appended at the bottom
        {
            if(((p%t)==0)&&(p<e))
            {
                s++;
            }
        }   
        return s+t;
    }
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
    public void encrypt(String str,int len)
    {
        int t,s;
        t=checkpsq(len);
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
    public void decrypt(String str,int len)
    {
        int t,s;
        t=checkpsq(len);
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
        
