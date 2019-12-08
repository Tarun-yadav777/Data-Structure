package data_structure.DSrelated;

import java.util.Scanner;

public class BubbleSort {
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
        System.out.println("Array before bubble sort");
        for (int i=0;i<x;i++)
        {
            System.out.print(array[i]+", ");
        }
        System.out.println();
        bubblesort(array,x);
    }
    public static void bubblesort(int array[],int x)
    {   int temp;
    for(int j=0;j<x;j++) {
        for (int i = 0; i < x - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
    }
        System.out.println("Array after bubble sort");
        for(int i=0;i<x;i++)
        {
            System.out.print(array[i]+", ");
        }
    }
}
