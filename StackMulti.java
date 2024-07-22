class StackMulti{

int stack[]=new int[5];
int top=-1;

public void push(int data){
if(top==stack.length-1){
System.out.println("over flow condition");
}else{
top++;
stack[top]=data;
}

}
public int peek(){
int r=-1;
if(top==-1){
System.out.println("Stack is Empty");
}
else{

r=stack[top];
}
return r;
}

public void display(){
if(top==-1){
System.out.println("stack is empty");
}
else{
System.out.println("Stack Elements Are");
for(int i=top;i>=0;i--){
System.out.println("===>"+stack[i]);
}
}
}

public int pop(){
int r=-1;

if(top==-1){
System.out.println("Under Flow");
}
else{
r=stack[top];
top--;
}
return r;
}

public boolean isEmpty(){
return top==-1? true : false;

}
public boolean isFull(){
return top==stack.length-1? true : false;

}
public static void main(String args[]){

StackMulti st=new StackMulti();
st.push(10);
st.push(20);
st.push(30);
st.push(40);
st.push(50);
System.out.println("Stack is Full : "+st.isFull());
st.push(60);
st.display();
System.out.println("Deleted Element :"+st.pop());
System.out.println("Deleted Element :"+st.pop());
System.out.println("Deleted Element :"+st.pop());
System.out.println("Top Element :"+st.peek());

System.out.println("Deleted Element :"+st.pop());

System.out.println("Deleted Element :"+st.pop());
System.out.println("Deleted Element :"+st.pop());
System.out.println("Stack is Empty :"+st.isEmpty());

}

}