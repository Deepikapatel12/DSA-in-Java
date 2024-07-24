
class DeleteFirstNode{

		public Node deleteFirst(Node head){
	
		Node temp=head;
		if(head==null){
		System.out.println("List is Emty");
		}
		else{
		temp=head.next;
		}
		return temp;
		}

	
	System.out.println("\n Print Data After Delete First Node \n");
	head.printData(head);

		}