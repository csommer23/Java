package classes;

public class Node {
	   
	private Object data;    
	private Node nextNode;

	public Node( Object object ) { 
	   this( object, null ); 
	}
	
	public Node( Object object, Node node ) {
	   data = object;    
	   nextNode = node;  
	}
	
	public Object getData()  { 
	   return data;
	}
	
	public void setData (Object element){
	   data = element;
	}
	
	public Node getNext() { 
	   return nextNode;
	}
	
	public void setNext(Node o) { 
	      nextNode = o; 
	}
}
