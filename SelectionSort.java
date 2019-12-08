package data_structure.DSrelated;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String arg[])
    {
        System.out.println("Enter the element u want to add in array");
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        int array[]=new int[x];
        System.out.println("Enter the element ");
        Scanner s1= new Scanner(System.in);
        int y;
        for(int i=0;i<x;i++)
        {
            y=s1.nextInt();
            array[i]=y;
        }
        System.out.println("Array before selection sort");
        for (int i=0;i<x;i++)
        {
            System.out.print(array[i]+", ");
        }
        System.out.println();
        selsort(array,x);
    }
    public static void selsort(int array[],int x)
    {
        int small,pos=0,temp;
        for(int i=0;i<x-1;i++)
        {
            small=array[i];
            for(int j=i+1;j<x;j++)
            {
                if(array[j]<small)
                {
                    small=array[j];
                    pos=j;
                }
            }
            temp=array[i];
            array[i]=array[pos];
            array[pos]=temp;
        }
        System.out.println("Array after sorting");
        for(int i=0;i<x;i++)
        {
            System.out.print(array[i]+", ");
        }
    }
}
