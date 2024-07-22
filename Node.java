class Node{
//Node Singly Linked List
	int data;
	Node next;
	//member data
	public Node(int data){
	this.data=data;
	this.next=null;
	}

	public void printData(Node head){
	if(head==null){
	System.out.println("LIst is Empty");
	}
	else{
	Node temp=head;
	while(temp!=null){
	System.out.print("==>"+temp.data);
	temp=temp.next;
	}
	}
	}
	
	public static void main(String args[]){
	Node first=new Node(10);
	Node second=new Node(20);
	Node third=new Node(30);
	Node four=new Node(40);
	
	Node head=first;
	head.next=second;
	head.next.next=third;
	head.next.next.next=four;
	System.out.println("Print Data of Singly Linked List :");
	head.printData(head); 
	}	


}
