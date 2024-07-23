class AddnewNodeAtEnd{
//Add new node in first
	int data;
	Node next;
	//member data
	public Node(int data){
	this.data=data;
	this.next=null;
	}
	public Node addAtEnd(Node head, int d){
	Node newNode=new Node(d);
	if(head==null){
	head=newNode;
	return head;
	}
	else{
	Node temp=head;
	while(temp.next!null){
		temp=temp.next;
	}
	temp.next=newNode;
		return head;
	}
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

	head=head.addAtEnd(head,40);
	System.out.println("\n Data After Insert NEw NOde At End");
	head.printData(head);
	}	


}
