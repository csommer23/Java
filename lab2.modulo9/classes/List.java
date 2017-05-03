package classes;

public class List {
	
	private Node firstNode;
	private Node lastNode;
	private String name;

	public List() { 
		this("list"); 
	}  
	
	public List( String listName ) {
		name = listName;
		firstNode = lastNode = null;
	}
	   
	public Node getFirst(){
		return firstNode;
	}
	   
	public Node getLast(){
		return lastNode;
	}
	
	public  void insertAtFront(Object insertItem) {
		
		if (isEmpty())
			firstNode = lastNode = new Node(insertItem);		
		else
			firstNode = new Node(insertItem, firstNode);
	}
	
	
	public  void insertAtBack(Object insertItem) {
		
		if (isEmpty())
			firstNode = lastNode = new Node(insertItem);		
		else {
			lastNode.setNext (new Node(insertItem));
			lastNode = lastNode.getNext();
		}
	}
	
	public  Object removeFromFront() throws Exception {
		
		if (isEmpty())
			throw new Exception(name);
	
		Object removedItem = firstNode.getData();
		
		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else
			firstNode = firstNode.getNext();
		
		return removedItem;	
	}
	
	public  Object removeFromBack() throws Exception {
		
		if (isEmpty())
			throw new Exception(name);
		
		Object removedItem = lastNode.getData();
		
		if (firstNode == lastNode)
			firstNode = lastNode = null;		
		else {
			Node current = firstNode;		
		
			while (current.getNext() != lastNode)
				current = current.getNext();
			   
			lastNode = current;
			current.setNext(null);
		}
	
		return removedItem;
	}
	
	public boolean isEmpty() { 
		return firstNode == null;
	}
	
	public List invert() throws Exception {
		
		if (isEmpty()) throw new Exception(name);
		
		List list = new List();
		Node current = this.firstNode;
		while (current != null) {			
			list.insertAtFront(current.getData());
			current = current.getNext();			
		}
		
		return list;
	}
	
	public Object penultItemList() throws Exception {
		
		if (isEmpty()) throw new Exception(name);
		
		Node current = this.firstNode;
		Object returnPenultItem = null;
		while (current != null) {			
			returnPenultItem = current.getData();			
			current = current.getNext();		
			if(current != null && current.getNext() == null)
				break;
		} 
		
		return returnPenultItem;
	}
	
	public  void print() {
		
		if (isEmpty()) {
			System.out.println("Empty " + this.name);
			return;
		}
	
		System.out.print("The " + name + " is: ");
		Node current = this.firstNode;
		
		while (current != null) {
			System.out.print( current.getData().toString() + " " );
			current = current.getNext();
		}
		
		System.out.println("\n");
	}
	
	public boolean troca_ter_quarto() {
		
		if (isEmpty()) return false;
		
		Node current = this.firstNode;	
		
		for (int i = 1; current != null; i++) {
			
			if(i == 3 && current.getNext() != null) {
				Node itemFour = current.getNext();
				Node itemThree = current;
				
				Object aux = itemFour.getData();
				itemFour.setData(itemThree.getData());
				itemThree.setData(aux);
				return true;
			} else
				current = current.getNext();		
		}
		
		return false;
	}
	
	public boolean remove_impar() {
		
		if (isEmpty()) return false;
		
		Node current = this.firstNode;
		Node next;	
		
		while (current != null) {
			if(Integer.parseInt(current.getData().toString()) % 2 == 1) {
				current = this.firstNode = current.getNext();
			} else 
				break;			
		}
		
		while (current != null) {	
			next = current.getNext();
			if(next != null && Integer.parseInt(next.getData().toString()) % 2 == 1) {
				Node aux = next.getNext();
				next.setNext(null);
				current.setNext(aux);				
			} else 
				current = current.getNext();
		}
		
		return true;	
	}
}
