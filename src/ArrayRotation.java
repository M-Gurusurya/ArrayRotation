import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println("Enter number");
        int number=scanner.nextInt();
        number=number%size;
        int start=0;
        int end=size-1;
        reverse(array,start,end);
        reverse(array,0,number-1);
        reverse(array,number,end);
        for (int j=0;j<size;j++)
        {
            System.out.println(array[j]+" ");
        }
    }
    public static void reverse(int array[],int start,int end)
    {
        while(start<end)
        {
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }
}
