import java.util.Arrays;
import java.util.Scanner;

public class ArrayInitialize {
    public static void main(String[] args){
        int a[]=new int[5];
        Arrays.fill(a,5);
        for (int i=0;i<a.length ;i++)
            System.out.println("value of a[" + i + "]:"+a[i]);

        int b[]=new int[5];
        for (int i=0;i<a.length ;i++)
            b[i]=i+1;
        for (int i=0;i<b.length ;i++)
            System.out.println("value of b[" + i + "]:"+b[i]);

        int c[]=new int[5];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 integer values:");
        for (int i=0;i<c.length ;i++)
            c[i]=sc.nextInt();
        for (int i=0;i<c.length ;i++)
            System.out.println("value of c[" + i + "]:"+c[i]);




    }
}
