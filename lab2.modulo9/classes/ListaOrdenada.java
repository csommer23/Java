package classes;

public class ListaOrdenada extends List {
	

	public void insert(String s) throws Exception {
		
		this.insertAtFront(s);
		
		this.order(true);
	}

	public void printAscending() {
		this.order(true);
		this.print();
	}

	public void printDescending() {
		this.order(false);
		this.print();
	}
	private void order(Boolean typeOrder) {

		Node current = this.getFirst();
		while (current != null) {	
			Node next = current.getNext();	
			while (next != null) {
				String valueCurrent = (String)current.getData();
				String valueNext = (String)next.getData();
				if(valueCurrent.compareTo(valueNext) > 0 == typeOrder) {
					current.setData(valueNext);
					next.setData(valueCurrent);
				}
				next = next.getNext();
			}
			current = current.getNext();			
		}
	}
}
