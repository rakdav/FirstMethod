import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptThrows
{
    public static void main(String[] args) throws IOException {
        String path="src/Files/textfile.txt";

        int c= 0;
        try(FileInputStream inf=new FileInputStream(path))
        {
            c = inf.read();

            while (c != -1) {
                System.out.print((char) c);
                c = inf.read();
            }
        }
//        catch (IOException ex)
//        {
//            System.out.println(ex.getMessage());//возвращает сообщение об исключении
//            System.out.println(ex.getStackTrace());//возвращает массив, содержащий трассировку стека исполнения
//            ex.printStackTrace();//отображает трассировку стека
//        }
    }
}
