/*
Interview Question #6:

Construct an in-place algorithm to reverse a linked list!

*/

public class Main
{
public static void main(String[] args) {
Linked lis =new Linked(4);
lis.push(5);
lis.push(6);
lis.push(7);
lis.push(8);
lis.push(9);

lis.display();

lis.reverse();

lis.display();

    
}
}
class Linked{
    
	Node head;
	
Linked(int a){
head=new Node(a);
}

void push(int a){
Node temp = head;
Node newnode=new Node(a);
while(temp.next!=null)temp=temp.next;
temp.next=newnode;
}

void display(){
		System.out.print("values : ");
	Node temp = head;
while(temp!=null){
	System.out.print(" "+temp.value);
	temp=temp.next;
}
System.out.println();
}

void reverse(){
    Node temp=head;
    Node prev=null;
    Node next = head.next;
    while(next!=null){
        temp.next=prev;
        prev=temp;
        temp=next;
        next=next.next;
    }
    temp.next=prev;
    head=temp;
}

}
class Node {
	Node next;
	int value;
	Node(int a){
		this.value=a;
	}
}
