
package stacks;

class Stacks1{
    int top;
    int stacks[] = new int[5];
    public void push(int data){
        if(top!=5)
        {
            stacks[top]=data;
            top++;
        }
        else 
        {
            System.out.println("overflowed");
        }    
      
    }
    public int pop(){
        top--;
        int data=stacks[top];
        if(top!=0)
        {
          stacks[top]=0;
        }
        else
        {
            System.out.println("underflowed");
        }
        return data;
    }
    public void show(){
        for(int k:stacks)
        {
            System.out.print(k+" ");
        }
        System.out.println("");
    }
} 
        
public class Stacks {

   
    public static void main(String[] args) {
       Stacks1 obj = new Stacks1();
       obj.push(50);
       obj.push(60);
       obj.push(70);
       obj.push(80);
       obj.push(90);
       obj.show();
        System.out.println("poped element ="+obj.pop());
        obj.show();
    }
    
}
