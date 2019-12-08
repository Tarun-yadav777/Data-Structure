package data_structure.DSrelated;

import java.util.Scanner;

public class BinaryS {
    public static void main(String arg[])
    {
        System.out.println("Enter the number elements for array");
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        int array[]=new int[x];
        System.out.println("Enter the elements in array in ascending order ");
        Scanner s1 = new Scanner(System.in);
        for(int i=0;i<x;i++) {
            int y = s1.nextInt();
            array[i]=y;
        }
        System.out.println("Enter the elements to searched");
        Scanner s3 =new Scanner(System.in);
        int z = s3.nextInt();
        int a;
        a=bsmethod(array,x,z);
        System.out.println("Element we searched for is at "+(a+1)+" position");
    }
    public static int bsmethod(int arr[],int x,int z)
    {
        int beg=0;
        int end=x-1;
        int mid;
        while(beg<=end)
        {
            mid=(beg+end)/2;
            if(z==arr[mid])
                return mid;
            else if (z>arr[mid])
            {
                beg=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }

}
