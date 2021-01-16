import java.util.Scanner;

public class MainException
{
    public static void main(String[] args) throws FactorialException {
//        try
//        {
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            if(n<0) throw new FactorialException("Число не должно быть меньше 0",n);
            long F=1;
            for(int i=1;i<=n;i++) F*=i;
            System.out.println(F);
//        }
//        catch (FactorialException ex)
//        {
//            System.out.println(ex.getNumber());
//            System.out.println(ex.getMessage());
//        }
    }
}
