import java.util.Scanner;
public class CipherText
{
    public static void main(String[] args)
    {
        int len;
        String str,c,ch;
        do{
            System.out.println("Enter the string");
            Scanner scan=new Scanner(System.in);
            str=scan.nextLine();
            len=str.length();
            Cipher m=new Cipher();
            System.out.println("Enter 'e' to encrypt or 'd' to decrypt");
            ch=scan.next();
            if(ch.charAt(0)=='e')
            {
                m.encrypt(str,len); 
            }else if(ch.charAt(0)=='d')
            {
                 m.decrypt(str,len);
            }
            System.out.println("Do you want to Continue?? [Y/N]");
            c=scan.next();
        }while(c.equals("Y"));
    }   
}
