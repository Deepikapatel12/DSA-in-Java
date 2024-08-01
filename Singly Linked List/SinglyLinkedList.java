
public class SinglyLinkedList{
	private Node head;
	private Node tail;

	public SinglyLinkedList(){
		head = null;
	}

	// insert
	// delete
	// traverse  -> print
	// search

	// insert -> at the beginning
	// at the end 
	// at given position
	// after a given node;
	// before the given node

	public boolean insert(int data){
		Node node = new Node(data);
		if(head == null){
			// head se link karo new node ko
			head  = node;
		}else{
			// node ke next ko bolo
			// refer to the node refered by head
			
			node.setNext(head);
			// head must refer to new node
		}
		return true;

	}

}
