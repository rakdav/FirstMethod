import java.util.Scanner;

public class ExceptThrow
{
    public static void main(String[] args) {
        try
        {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n<0) throw new Exception("Число не может быть меньше 0");
        long F=1;
        for(int i=1;i<=n;i++) F*=i;
            System.out.println(F);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
