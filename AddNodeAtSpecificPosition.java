class AddNodeAtSpecificPosition{
//Add new node in first
	int data;
	Node next;
	//member data
	public AddNodeAtSpecificPosition(int data){
	this.data=data;
	this.next=null;
	}
	
	public void insertNodeAtPos(Node head, int data, int pos){
	Node newNode=new node(data);
	pos--;
	AddNodeAtSpecificPosition temp=head;
	AddNodeAtSpecificPosition temp1=head.next;
	while(pos>1){
	temp=temp.next;
	temp1=temp1.next;
	pos--;
	}
	temp.next=newNode;
	newNode.next=temp1;
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

	head.insertNodeAtPos(head,35,4);
	System.out.println("\n print  Data After Add NEw NOde At position 4");
	head.printData(head);
	}	


}
