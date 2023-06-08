import java.util.*;
class Node
{
    String data;
    Node next;
    
    Node(String data)
    {
        this.data = data;
        this.next = null;
    }
}
class Queue
{
    Node f = null;
    Node r = null;
    
    void enque()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data");
        String data = sc.nextLine();
        Node nnode = new Node(data);
        if(f == null)
        {
            f = nnode;
            r = nnode;
        }
        else
        {
            r.next = nnode;
            r = nnode;
        }
    }
    
    void dequeue()
    {
       if(f == null)
       {
           System.out.println("Empty");
       }
       else
       {
           f= f.next;
       }
    }
    void display()
    {
        Node temp;
        for(temp = f;temp != null ; temp = temp.next)
        {
            System.out.println(temp.data);
        }
    }
}
class main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        Queue q = new Queue();
        int l,d;
        int n = 4;
    do
    {    
       System.out.println("1 to enque");
       System.out.println("2 to dequeue");
       System.out.println("3 to display");
       System.out.println("Enter your choice");
       d= sc.nextInt();
       switch(d)
       {
           case 1:
           {
               q.enque();
               break;
           }
           case 2:
            {
                q.dequeue();
                break;
            }
            case 3:
            {
                q.display();
                break;
            }
       }
       System.out.println("Enter the 0 to menu again");
       System.out.println("Enter any key to exit");
       l = sc.nextInt();
       
        
    }while(l==00);
    System.out.println("exited");
    
}
}