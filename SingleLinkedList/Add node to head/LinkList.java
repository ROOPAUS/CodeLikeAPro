public class LinkList <T>{
	public Node<T> head;

	  public LinkList() {
	    head = null;
	  }

	  public void addHead(T data) {
	    Node<T> add = new Node<T>(data);
	    add.next = head;
	    head = add;
	  }
	  
	  public void printList() {
		  if(head==null)
		  {
			  return;
		  }
		  Node<T> temp=head;
		  while(temp!=null) {
			  System.out.print(temp.data+"->");
			  temp=temp.next;
		  }
		  System.out.print("Null");
	  }
}