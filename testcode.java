public class Main{
    Node head;
    void add(int a){
        Node newNode=new Node(a);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;            
        }
        temp.next=newNode;
    }
}
void display(){
    Node temp=head;
    if(temp==null){
        System.out.println("I am empty");
        
    }
    else{
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
}
public static void main(String[] args){
    Main obj=new Main();
    obj.add(10);
    obj.add(20);
    obj.add(30);
    obj.display();
} 
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
