import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Except
{
    public static void main(String[] args) {
       String path="src/Files/textfile.txt";
       FileInputStream inf=null;
        try {

            Scanner in=new Scanner(System.in);
            int[] number = new int[3];
            int[] mas=null;
            for (int i : number) {
                System.out.println(i);
            }
//            number[4] = 45;
//            System.out.println(number[4]);
            int a=in.nextInt();
            int b=in.nextInt();
            double s=(double) a/b;
            System.out.println(s);
//            inf=new FileInputStream(path);
//            int c=inf.read();
//            while (c!=-1)
//            {
//                System.out.print((char) c);
//                c=inf.read();
//            }
            System.out.println(mas[0]);
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Деление  на ноль запрещено");
        }
        catch (NullPointerException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println(ex.getStackTrace());//возвращает массив, содержащий трассировку стека исполнения
            ex.printStackTrace();//отображает трассировку стека
        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        finally {
            System.out.println("Finally");
            try {
                if(inf!=null) inf.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
