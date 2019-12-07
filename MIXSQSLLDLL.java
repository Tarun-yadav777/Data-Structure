package data_structure.DSrelated;

import java.net.SecureCacheResponse;
import java.sql.SQLOutput;
import java.util.Scanner;
class Node{
    int data;
    Node next;
}
class NodeD{
    int data;
    NodeD next,prev;
}
class Mix{
    int top,front,rear,size;
    int stack[] = new int[5];
    int queue[] = new int[5];
    Node head;
    NodeD head1;
    public Mix()
    {
        top=0;
        front=0;
        size=0;
        rear=0;
    }
    public void stack_push(int data)
    {
        if(top!=5)
        {
            stack[top]= data;
            top++;
        }
        else
            System.out.println("overflowed");
    }
    public int stack_pop()
    {
        int data;
        top--;
        data=stack[top];
        if(top!=0)
            stack[top]=0;
        else
            System.out.println("underflowed");
        return data;
    }
    public void stack_show()
    {
        System.out.println("Stacks ->");
        for(int k : stack)
        {
            System.out.print(k+", ");
        }
    }
    public void queue_enQueue(int data)
    {
        if(size!=5)
        {
            queue[rear]=data;
            rear++;
            size++;
        }
        else
            System.out.println("overflowed");
    }
    public int queue_deQueue()
    {
        int data;
        data=queue[front];
        if(size!=0)
        {
            front++;
            size--;
        }
        else
            System.out.println("underflowed");
        return data;
    }
    public void queue_show()
    {
        System.out.println("Queue ->");
        for(int i=0;i<size;i++)
        {
            System.out.print(queue[front+i]+", ");
        }
    }
    public void single_insertATend(int data)
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
    public void single_insertATfornt(int data)
    {
        Node new_node = new Node();
        new_node.data=data;
        new_node.next=head;
        head=new_node;
    }
    public void single_insertATanyindex(int data,int index)
    {
        Node new_node = new Node();
        new_node.data=data;
        new_node.next=null;
        Node temp_node = head;
        for(int i=0;i<index;i++)
        {
            temp_node=temp_node.next;
        }
        new_node.next=temp_node.next;
        temp_node.next=new_node;
    }
    public void single_delete(int index)
    {
        Node temp_node = head;
        for(int i=0;i<index;i++)
        {
            temp_node=temp_node.next;
        }
        temp_node.next=temp_node.next.next;
    }
    public void single_show()
    {
        Node temp_node = head;
        System.out.println("Single LinkedList ->");
        while(temp_node!=null)
        {
            System.out.print(temp_node.data+", ");
            temp_node=temp_node.next;
        }
    }
    public void double_insertATend(int data)
    {
        NodeD new_node = new NodeD();
        new_node.data=data;
        new_node.next=null;
        new_node.prev=null;
        if(head1==null)
            head1=new_node;
        else
        {
            NodeD last = head1;
            while(last.next !=null)
            {
                last=last.next;
            }
            last.next=new_node;
            new_node.prev=last;
        }
    }
    public void double_insertATfront(int data)
    {
        NodeD new_node = new NodeD();
        new_node.data=data;
        new_node.next=head1;
        new_node.prev=null;
        if(head1!=null)
            head1.prev=new_node;
        head1=new_node;
    }
    public void double_insertATanyposi(int data,int index)
    {   NodeD new_node = new NodeD();
        new_node.data=data;
        new_node.next=null;
        new_node.prev=null;
        NodeD last = head1;
        for(int i=0;i<index;i++)
        {
            last=last.next;
        }
        new_node.next=last.next;
        last.next=new_node;
        new_node.prev=last;
    }
    public void double_delete(int index)
    {
        NodeD temp = head1;
        if(index==1)
        {
            head1=head1.next;
            head1.prev=null;
        }
        else
        {
            for(int i=0;i<index;i++)
            {
                temp=temp.next;
            }
            temp.prev=temp.next;
            temp.prev=null;
            temp.next=null;
        }
    }
    public void double_show()
    {
        NodeD node = head1;
        NodeD last = null;
        System.out.println("Elements in front direction ->");
        while(node!=null)
        {
            System.out.print(node.data+", ");
            last=node;
            node=node.next;
        }
        System.out.println();
        System.out.println("Elements in backward direction ->");
        while(last!=null)
        {
            System.out.print(last.data+", ");
            last=last.prev;;
        }
    }

}
public class MIXSQSLLDLL {
    public static void main(String arg[])
    {
        Mix obj = new Mix();
        Scanner scan = new Scanner(System.in);
        char ch1,ch2,ch3,ch4,ch5=0;
        do {

                System.out.println("\nHalf Data Structure Operations");
                System.out.println("BY .:**TARUN YADAV**:.");
                System.out.println("1. Stacks Implementation");
                System.out.println("2. Queue Implementation");
                System.out.println("3. Single Linked List Implementation");
                System.out.println("4. Double Linked List Implementation");
                System.out.println("-> Enter the operation u wanna do first");
                Scanner s1 = new Scanner(System.in);
                int choice1 = s1.nextInt();
                switch(choice1)
                {
                    case 1:
                        do {
                            System.out.println("\nStack Operations\n");
                            System.out.println("1.Push in Stack");
                            System.out.println("2. Pop from Stack");
                            System.out.println("3. Show Stack");
                            Scanner s2 = new Scanner(System.in);
                            int choice2 = s2.nextInt();
                            switch(choice2)
                            {
                                case 1:
                                    System.out.println("Enter the 5 element to be pushed");
                                    Scanner s3 = new Scanner(System.in);
                                    for(int i=0;i<5;i++) {
                                        int n1 = s3.nextInt();
                                        obj.stack_push(n1);

                                    }
                                    break;
                                case 2:
                                    System.out.println("Number pushed from stack ="+obj.stack_pop());
                                    break;
                                case 3:
                                    obj.stack_show();
                                    break;
                                default:
                                    System.out.println("Wrong choice!!!");
                                    break;
                            }
                            System.out.println("\nDo you want to continue (Type y or n) \n");
                            ch2 = scan.next().charAt(0);
                        } while(ch2 == 'Y'|| ch2 == 'y');
                    break;
                    case 2:
                        do {
                            System.out.println("\nQueue Operations\n");
                            System.out.println("1.enQueue");
                            System.out.println("2.deQueue");
                            System.out.println("3.View Queue");
                            Scanner s4 = new Scanner(System.in);
                            int choice3 = s4.nextInt();
                            switch(choice3)
                            {
                                case 1:
                                    System.out.println("Enter the 5 element in queue");
                                    Scanner s5 = new Scanner(System.in);
                                    for(int i=0;i<5;i++)
                                {
                                    int n2 = s5.nextInt();
                                    obj.queue_enQueue(n2);
                                }
                                break;
                                case 2:
                                    System.out.println("Number deQueued from queue= "+obj.queue_deQueue());
                                break;
                                case 3:
                                    obj.queue_show();
                                    break;
                                default:
                                    System.out.println("Wrong choice!!!");
                                    break;
                            }
                            System.out.println("\nDo you want to continue (Type y or n) \n");
                            ch3 = scan.next().charAt(0);
                        } while (ch3 == 'Y'|| ch3 == 'y');
                        break;
                    case 3:
                        do {
                            System.out.println("\nSingle Linked List Operations\n");
                            System.out.println("1. insert from end");
                            System.out.println("2. insert at start");
                            System.out.println("3. insert at any position");
                            System.out.println("4. delete");
                            System.out.println("5. show list");
                            Scanner s6 = new Scanner(System.in);
                            int choice4 = s6.nextInt();
                            switch (choice4)
                            {
                                case 1:
                                    System.out.println("Enter the number of element u want to enter");
                                    Scanner s7 = new Scanner(System.in);
                                    int n3 = s7.nextInt();
                                    System.out.println("enter elements");
                                    Scanner s8 = new Scanner(System.in);
                                    for(int i=0;i<n3;i++)
                                    {
                                        int n4 = s8.nextInt();
                                        obj.single_insertATend(n4);
                                    }
                                    break;
                                case 2:
                                    System.out.println("Enter the element to insert at front");
                                    Scanner s9 = new Scanner(System.in);
                                    int n5 = s9.nextInt();
                                    obj.single_insertATfornt(n5);
                                    break;
                                case 3:
                                    System.out.println("enter the element to insert at position");
                                    Scanner s10 = new Scanner(System.in);
                                    int n6 = s10.nextInt();
                                    System.out.println("Enter the index");
                                    Scanner s11 = new Scanner(System.in);
                                    int n7 = s11.nextInt();
                                    obj.single_insertATanyindex(n6,n7);
                                    break;
                                case 4:
                                    System.out.println("enter the index for deletion");
                                    Scanner s12 = new Scanner(System.in);
                                    int n8 = s12.nextInt();
                                    obj.single_delete(n8);
                                    break;
                                case 5:
                                    obj.single_show();
                                    break;
                                default:
                                    System.out.println("Wrong Choice !!!!");
                                    break;
                            }
                            System.out.println("\nDo you want to continue (Type y or n) \n");
                            ch4 = scan.next().charAt(0);
                        }while (ch4 == 'Y'|| ch4 == 'y');
                    break;
                    case 4:
                        do {
                            System.out.println("\nDouble Linked List Operations\n");
                            System.out.println("1. insert from end");
                            System.out.println("2. insert at start");
                            System.out.println("3. insert at any position");
                            System.out.println("4. delete");
                            System.out.println("5. show list");
                            System.out.println("-> Enter the operation u wanna do first");
                            Scanner s13 = new Scanner(System.in);
                            int choice5 = s13.nextInt();
                            switch (choice5)
                            {
                                case 1:
                                    System.out.println("Enter the number element u want to insert at end");
                                    Scanner s14 = new Scanner(System.in);
                                    int n9 = s14.nextInt();
                                    System.out.println("enter the element");
                                    Scanner s15 =new Scanner(System.in);
                                    for(int i=0;i<n9;i++)
                                    {
                                        int n10 = s15.nextInt();
                                        obj.double_insertATend(n10);
                                    }
                                    break;
                                case 2:
                                    System.out.println("Enter the number u want to insert at front");
                                    Scanner s16 = new Scanner(System.in);
                                    int n11 = s16.nextInt();
                                    obj.double_insertATfront(n11);
                                    break;
                                case 3:
                                    System.out.println("Enter the posi u want to insert");
                                    Scanner s17 = new Scanner(System.in);
                                    int n12 = s17.nextInt();
                                    System.out.println("enter the element ");
                                    Scanner s18 = new Scanner(System.in);
                                    int n13 = s18.nextInt();
                                    obj.double_insertATanyposi(n13,n12);
                                    break;
                                case 4:
                                    System.out.println("Enter the index of element to be deleted");
                                    Scanner s19 =  new Scanner(System.in);
                                    int n14 = s19.nextInt();
                                    obj.double_delete(n14);
                                    break;
                                case 5:
                                    obj.double_show();
                                    break;
                            }
                            System.out.println("\nDo you want to continue (Type y or n) \n");
                            ch5 = scan.next().charAt(0);
                        }while (ch5 == 'Y'|| ch5 == 'y');
                    break;
                    default:
                        System.out.println("WRONG CHOICE !!!!!");
                }
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch1 = scan.next().charAt(0);
        }while (ch1 == 'Y'|| ch1 == 'y');

    }
}
