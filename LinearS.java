package data_structure.DSrelated;

import java.util.Scanner;

    public class LinearS {
        public static void main(String arg[])
        {
            System.out.println("Enter the number elements for array");
            Scanner s = new Scanner(System.in);
            int x=s.nextInt();
            int array[]=new int[x];
            System.out.println("Enter the elements in array");
            Scanner s1 = new Scanner(System.in);
            for(int i=0;i<x;i++) {
                int y = s1.nextInt();
                array[i]=y;
            }
            System.out.println("Enter the elements to searched");
            Scanner s3 =new Scanner(System.in);
            int z = s3.nextInt();
            int a;
            a=lsmethod(array,z,x);
            System.out.println("Elements found at "+(a)+" position");

        }
        public static int lsmethod(int arr[],int b,int c)
        {
            for(int i=0;i<c;i++)
            {
                if(arr[i]==c)
                {
                    System.out.println("Element is found");
                    return i;
                }
            }
            return -1;
        }
    }



