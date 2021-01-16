import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainClass
{
    static int x=89;
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        //int x=in.nextInt();
//        int y=in.nextInt();
//        int z=in.nextInt();
//        double result = ((Math.sqrt(x) + x) / 2) + ((Math.sqrt(y) + y) / 2) + ((Math.sqrt(z) + z) / 2);
//        System.out.println(result);
//        double result=Func(x)+Func(y)+Func(z);
//        System.out.println(result);
//        int a=in.nextInt();
//        int b=in.nextInt();
//        System.out.println(a+" "+b);
//        Integer A=Integer.valueOf(a);
//        Integer B=Integer.valueOf(b);

//        int temp=a;
//        a=b;
//        b=temp;
//        Swap(b);
//        System.out.println(a+" "+b);
//        Swap(A,B);
//        System.out.println(A+" "+B);
//        {
//            int g=7;
//            System.out.println(g);
//        }
       // System.out.println(g);
//        for(int i=0;i<=180;i+=10)
//        {
//            System.out.println(i+" "+ToRadian(i));
//        }
//        double Rs=(2.0*Fact(5)+3*Fact(8))/(Fact(6)+Fact(4));
//        System.out.println("Rs="+Rs);
       // System.out.println(2/10);
//        int n=in.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            if(i%Sum(i)==0) System.out.println(i);
//        }
        int[] mas=new int[10];
        Random rnd=new Random();
        for(int i=0;i<mas.length;i++)
        {
            mas[i]=rnd.nextInt(20)+1;
            System.out.print(mas[i]+" ");
        }
        if(SortEquals(mas))
        {
            System.out.println("Массив упорядочен");
            for(int i=0;i<mas.length;i++)
            {
                System.out.print(mas[i]+" ");
            }
        }
        else {
            mas=Sort(mas);
            System.out.println("Массив упорядочен после сортировки");
            for(int i=0;i<mas.length;i++)
            {
                System.out.print(mas[i]+" ");
            }
        }
    }
    public static double ToRadian(int n)
    {
        return n*Math.PI/180;
    }

    public static long Fact(int n)
    {
        long F=1;
        for(int i=1;i<=n;i++)
        {
            F*=i;
        }
        return F;
    }
    public static double Func(int n)
    {
        //in
        return (Math.sqrt(n) + n) / 2;
    }
    public static void Swap(int y)
    {
        int temp=x;
        x=y;
        y=temp;
    }
    public static void Swap(Integer x,Integer y)
    {
        Integer temp=x;
        x=y;
        y=temp;
    }
    public static int Sum(int n){
        int S=0;
        while (n!=0)
        {
            int m=n%10;
            S+=m;
            n/=10;
        }
        return S;
    }
    public static int[] Sort(int[] mas)
    {
        for(int i=0;i<mas.length-1;i++)
        {
            for(int j=i+1;j<mas.length;j++)
            {
                if(mas[i]>mas[j])
                {
                    int temp=mas[i];
                    mas[i]=mas[j];
                    mas[j]=temp;
                }
            }
        }
        return mas;
    }
    public static boolean SortEquals(int[] mas)
    {
        int[] m=new int[mas.length];
        for(int i=0;i<mas.length;i++)
        {
            m[i]=mas[i];
        }
        if(Arrays.equals(mas,Sort(m))) return true;
        return false;
    }
}
