public class ArraysJava {
    public static void main(String[] args) {
        int a[]=new int[]{5,4,3,2,1};
        int b[]=a;
        for(int i=0;i<b.length;i++)
            System.out.println("value of b[" + i + "]:"+b[i]);
        int z=b[0];
        System.out.println("value of z:"+b[0]);

    }
}
