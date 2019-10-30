package data_structure.stacks;

import java.util.Scanner;

class Name{
    int top=0;
    String stack[] = new String[10];
    public void push(String data){
        if(top!=10) {
            stack[top] = data;
            top++;
        }
        else
            System.out.println("overflow");
    }
    public String pop(){
        String data;
        top--;
        data=stack[top];
        if(top!=0){
            stack[top]="";
        }
        else
            System.out.println("underflowed");
        return data;
    }
    public void show(){
        for(String k:stack){
            System.out.print(k+" ");
        }
        System.out.println();
    }
}
public class MidTermQ {
    public static void main(String arg[])
    {
        System.out.println("enter the no of element u want to add in a stack(max 10 elements)= ");
        Name obj = new Name();
        Scanner s = new Scanner(System.in);
        String x;
        for(int i=0;i<10;i++)
        {
            x=s.nextLine();
            obj.push(x);
        }

        System.out.println("Orignal stack= ");
        obj.show();
        obj.pop();
        System.out.println("stack after poping ");
        obj.show();
    }
}
