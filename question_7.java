/*
Interview Question #7

The aim is to design an algorithm that can return the maximum item of a stack in O(1) running time complexity.
We can use O(N) extra memory!

Hint: we can use another stack to track the max item

*/

public class Main
{
    
static int[] stack=new int[5000];
static int top=-1;
static int[] maxStack=new int[500];
static int maxTop=-1;

static void push(int a){
    stack[++top]=a;
    
    if(maxTop==-1 || maxStack[maxTop]<a){
        maxStack[++maxTop]=a;
    }
    
}
static void pop(){
    if(top!=-1){
        
        if(stack[top]==maxStack[maxTop]){
        maxTop--;
        }
        top--;
    }
    
    
}

static void printMax(){
    if(maxTop==-1){
        System.out.println("empty");
        return;
    }
    System.out.println("Max Element : "+ maxStack[maxTop]);
}

public static void main(String[] args) {
    
    push(1);
    push(2);
    push(3);
    push(4);
    push(8);
    pop();
    pop();
   printMax();
    push(7);
    push(3);
    printMax();
    
    
}
}
