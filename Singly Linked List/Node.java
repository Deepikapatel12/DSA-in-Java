
public class Node{
	private int data;
	private Node next;
	
	public Node(){
		data = 0;
		next = null;
	}
	public Node(int data){
		this.data = data;
		next = null;
	}
	public int getData(){
		return data;
	}
	public void setData(int data){
		this.data = data;
	} 
	public void setNext(Node next){
		this.next = next;
	}
	public Node getNext(){
		return next;
	}
	public String toString(){
		return " " + data + " --->"; 
	}
}
