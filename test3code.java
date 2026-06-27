public class Main
{
Node head;

void add(int a)
{
    Node newNode = new Node(a);

    newNode.next = head;
    head = newNode;
}
    
void display(){
        Node temp=head;
        if(temp==null)
        {
            System.out.println("i am empty");
        }
        else
        {
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
}
public static void main(String[] args)
{
    Main obj=new Main();
    obj.add(10);
    obj.add(20);
    obj.add(30);
    obj.add(40);
    obj.display();
}
}
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
