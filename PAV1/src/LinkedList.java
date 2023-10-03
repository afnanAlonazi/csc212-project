
public class LinkedList<T> {
	private Node<T> head;
	private Node<T> current;
	public LinkedList() {
		head = current=null;
	}
	public boolean empty() {
		return head==null;
	}
	public boolean last() {
		return current.next==null;
	}
	public boolean full() {
		return false;
	}
	public void FindFirst() {
		current=head;
	}
	public void FindNext() {
		current=current.next;
	}
	public T retrive() {
		return current.data;
	}
	public void udpate(T data) {
		current.data = data;
	}
	public void SortedAdd(T contact) { 
		
		Node<T> c =new Node<T>(contact);
		
		if (empty())
			head=current= c;
		
		if(head.next==null)
			if ( ((Contact)contact).compareTo( ((Contact) head.data) ) >0) {
			 head.next= c;
	}
			else {
				c.next=head;
				head=c;
				
			}			
		
		
	}
}
