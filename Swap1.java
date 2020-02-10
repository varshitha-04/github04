import java.util.Scanner;
public class Swap1 {
    public static void main(String[] args){
        int a,b,temp;
        System.out.println("Enter 2 values to swap");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();

        temp=a;
        a=b;
        b=temp;

        System.out.println("Value of first variable:"+a);
        System.out.println("Value of first variable:"+b);
    }
}
