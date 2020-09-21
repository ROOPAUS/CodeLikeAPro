public class LinkList <T>
{
	public Node<T> head;

	public LinkList() 
	  {
	    head = null;
	  }

	  /**assuming there is no cycle**/
	public void addTail(T data)
	  {
		  Node<T> add= new Node<T>(data);
		  
		  if(head==null)
		  {
			  head=add;
			  return;
		  }
		  
		  Node<T> temp=head;
		  while(temp.next!=null)
		  {
			  temp=temp.next;
		  }
		  temp.next=add;
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