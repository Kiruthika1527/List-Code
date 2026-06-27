public class Main{
    Node head;
    void add(int a){
        Node newNode=new Node(a);
        if(head==null){
            head=newNode;
            newNode.next=head;
            return;
        }
        else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;            
        }
        temp.next=newNode;
        newNode.next=head;
    }
}
void display(){
    
    if(temp==null)
    return;
    node temp=head;
    do{
        System.out.println(temp.data + "->" );
        temp=temp.next;
    }while(temp!=head);{
            System.out.println("Back to Head");
            temp=temp.next;
        }
    }
}
public static void main(String[] args){
    
    Main obj=new Main();
    list.insert(10);
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
        newNode.prev=temp;
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
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list;insert(40);
    listdisplay();
} 
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

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
