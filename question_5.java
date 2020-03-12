/*

Interview Question #5:

Suppose we have a standard linked list. Construct an in-place (without extra memory)
 algorithm thats able to find the middle node !
*/

public class Main
{
public static void main(String[] args) {
Linked lis =new Linked(4);
lis.push(5);
lis.push(6);
lis.push(7);
lis.push(8);
lis.findMiddle();
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

void findMiddle(){
	Node temp = head;
	Node mid = head;
	int i=1;
while(temp.next!=null){
	temp=temp.next;
	if(i%2==0)mid=mid.next;
	i++;
}
System.out.println("middle value: "+mid.value);
}
}
class Node {
	Node next;
	int value;
	Node(int a){
		this.value=a;
	}
}
