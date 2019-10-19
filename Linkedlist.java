package data_structure.LinkedList;

import java.util.Scanner;

class Node{
    int data;
    Node next;
}
public class Linkedlist {
    Node head;
    public void insert(int data)
    {
        Node new_node = new Node();
        new_node.data=data;
        new_node.next=null;
        if(head==null)
        {
            head=new_node;
        }
        else
        {
            Node temp_node = head;
            while(temp_node.next!=null)
            {
                temp_node=temp_node.next;
            }
            temp_node.next=new_node;
        }
    }
    public void atStart(int data)
    {
        Node new_node = new Node();
        new_node.data=data;
        new_node.next=null;
        new_node.next=head;
        head=new_node;
    }
    public void atAnyindex(int data,int index)
    {
        Node new_node = new Node();
        new_node.data=data;
        new_node.next=null;
        if(index==0)
        {
            atStart(data);
        }
        else
        {
            Node temp_node=head;
            for(int i=0;i<index-1;i++)
            {
                temp_node=temp_node.next;
            }
            new_node.next=temp_node.next;
            temp_node.next=new_node;
        }
    }
    public void deleteat(int index)
    {
        if(index==0)
        {
            head=head.next;
        }
        else
        {
            Node temp_node = head;
            Node temp_node2 = null;
            for(int i=0;i<index-1;i++)
            {
                temp_node=temp_node.next;

            }
            temp_node2=temp_node;
            temp_node.next=temp_node2.next;

        }
    }
    public void show()
    {
        Node temp_node = head;
        System.out.println("Elements= ");
        while(temp_node.next!=null)
        {
            System.out.print(temp_node.data+" ");
            temp_node=temp_node.next;
        }
        System.out.println(temp_node.data);
    }

}
class Main4{
     public static void main(String arg[])
     {
         Linkedlist list = new Linkedlist();
         Scanner scan = new Scanner(System.in);
         char ch = 0;
         do {


         System.out.println("\nDoubly Linked List Operations\n");
         System.out.println("1. insert from end");
         System.out.println("2. insert at start");
         System.out.println("3. insert at any position");
         System.out.println("4. delete at start");
         System.out.println("5. show list");
         System.out.println("enter the operation u wanna do first");
         System.out.println("IMPORTANT");
         System.out.println("Perform the first operation first");
         Scanner s3 = new Scanner(System.in);
         int choice = s3.nextInt();
         switch (choice)
         {
             case 1 :
                 System.out.println("Enter how many elements u want to enter= ");
                 Scanner s  = new Scanner(System.in);
                 int x = s.nextInt();
                 System.out.println("enter the elements= ");
                 Scanner s1 = new Scanner(System.in);
                 int y;
                 for(int i=0;i<x;i++)
                 {
                     y=s1.nextInt();
                     list.insert(y);
                 }
                 break;
             case 2:
                  System.out.println("Enter the element u want to add at start= ");
                  Scanner s4 = new Scanner(System.in);
                  int atstart = s4.nextInt();
                  list.atStart(atstart);
                  break;
             case 3:
                 System.out.println("Enter the element u want to enter at any position = ");
                 Scanner s5 = new Scanner(System.in);
                 int atany = s5.nextInt();
                 System.out.println("Enter the element u want to enter at any position = ");
                 Scanner s6 = new Scanner(System.in);
                 int posi = s6.nextInt();
                 list.atAnyindex(atany,posi);
                 break;
             case 4:
                 list.deleteat(0);
                 break;
             case 5:
                 list.show();
                 break;
             default:
                 System.out.println("invalid choice");
                 break;


         }
             System.out.println("\nDo you want to continue (Type y or n) \n");
             ch = scan.next().charAt(0);

         }while (ch == 'Y'|| ch == 'y');

     }
}
