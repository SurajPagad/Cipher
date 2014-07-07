import java.util.Scanner;
public class CipherText
{
    public static void main( String[] args )
    {
        int len;
        String str,choice,choice1;
        do{
            System.out.println("Enter the string");
            Scanner scan = new Scanner(System.in);
            str = scan.nextLine();
            len = str.length();
            Encrypt e = new Encrypt();
            Decrypt d = new Decrypt();
            System.out.println("Enter 'e' to encrypt or 'd' to decrypt");
            choice = scan.next();
            if( choice.equals("e") )
            {
                 e.encrypt( str,len ); 
            }else if( choice.equals("d") )
            {
                 d.decrypt( str,len );
            }
            System.out.println("Do you want to Continue?? [Y/N]");
            choice1 = scan.next();
        }while( choice1.equals("Y") );
    }   
}
